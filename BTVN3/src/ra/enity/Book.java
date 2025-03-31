package ra.enity;

import ra.validate.BookValidator;
import ra.validate.IntegerValidator;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Book implements IApp{
    public static Set<String> uniqueName = new HashSet<String>();
    private String id;
    private String name;
    private String author;
    private int quantity;

    public Book(String id, String name, String author, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public Book(){
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public void inputData(Scanner input){
        this.id = inputBookId(input);
        this.name = inputBookName(input);
        uniqueName.add(this.name);
        this.author = inputAuthor(input);
        this.quantity = inputBookQuantity(input);
    }

    @Override
    public String toString(){
        return "ID: " + id + "\nName: " + name + "\nAuthor: " + author + "\nQuantity: " + quantity;
    }

    private String inputBookId(Scanner input){
        return BookValidator.validateId(input, "Enter the ID", "[B]\\d{4}$");
    }

    private String inputAuthor(Scanner input){
        System.out.print("Enter the author: ");
        return input.nextLine();
    }

    private String inputBookName(Scanner input){
        return BookValidator.validateName(input, "Enter the book name", new Length(0, 255));
    }

    private int inputBookQuantity(Scanner input){
        return IntegerValidator.validateInteger(input, "Enter the quantity: ", 0);
    }
}
