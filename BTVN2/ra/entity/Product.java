package entity;

import until.ProductFilter;

import java.time.LocalDate;
import java.util.Scanner;

public class Product implements IProduct{
    private static int idSequence = 0;
    private int productId;
    private String productName;
    private float price;
    private String category;
    private LocalDate createdDate;

    public Product(String productName, float price, String category, LocalDate createdDate){
        this.productId = ++idSequence;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.createdDate = createdDate;
    }

    public Product(){
        this.productId = ++idSequence;
    }

    public int getIdSequence(){
        return idSequence;
    }


    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public LocalDate getCreatedDate(){
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate){
        this.createdDate = createdDate;
    }

    @Override
    public void inputData(Scanner input){
        System.out.print("Enter product name: ");
        this.productName = input.nextLine();
        System.out.print("Enter product price: ");
        this.price = Float.parseFloat(input.nextLine());
        System.out.print("Enter category: ");
        this.category = input.nextLine();
        this.createdDate = LocalDate.now();
    }

    public void updateData(Scanner input){
        System.out.print("Enter product name: ");
        this.productName = input.nextLine();
        System.out.print("Enter product price: ");
        this.price = Float.parseFloat(input.nextLine());
        System.out.print("Enter category: ");
        this.category = input.nextLine();
    }

    @Override
    public void displayData(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Category: " + category);
        System.out.println("Product Created: " + createdDate);
    }
}
