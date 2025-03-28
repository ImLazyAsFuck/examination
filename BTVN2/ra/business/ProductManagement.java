package business;

import entity.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductManagement{
    public static List<Product> products = new ArrayList<>();

    public static void addProduct(Scanner input){
        System.out.print("Enter amounts of products: ");
        int amount = Integer.parseInt(input.nextLine());

        for(int i = 0; i < amount; i++){
            Product newProduct = new Product();
            System.out.println("Product " + newProduct.getProductId());
            newProduct.inputData(input);
            products.add(newProduct);
        }

        System.out.println("Product added successfully");
    }

    public static void displayData(){
        if(products.isEmpty()){
            System.out.println("Products list is empty");
            return;
        }
        products.forEach(Product::displayData);
    }

    public static void updateProduct(Scanner input){
        if(products.isEmpty()){
            System.out.println("Products list is empty");
            return;
        }
        products.forEach(product -> {
            System.out.println("ID: " + product.getProductId() + " Name: " + product.getProductName());
        });
        System.out.println("Enter product ID: ");
        int productId = Integer.parseInt(input.nextLine());
        int finalIndex = products.stream()
                .filter(p -> p.getProductId() == productId)
                .findFirst()
                .map(products::indexOf)
                .orElse(-1);
        if(finalIndex == -1){
            System.out.println("Product not found");
            return;
        }
        products.get(finalIndex).updateData(input);
    }

    public static void deleteProductById(Scanner input){
        if(products.isEmpty()){
            System.out.println("Products list is empty");
            return;
        }
        products.forEach(product -> {
            System.out.println("ID: " + product.getProductId() + " Name: " + product.getProductName());
        });
        System.out.print("Enter product ID: ");
        int productId = Integer.parseInt(input.nextLine());
        products.remove(productId);
    }

    public static void deleteProductByName(Scanner input){
        if(products.isEmpty()){
            System.out.println("Products list is empty");
            return;
        }
        products.forEach(product -> {
            System.out.println("ID: " + product.getProductId() + " Name: " + product.getProductName());
        });
        System.out.print("Enter product name: ");
        String productName = input.nextLine();
        products.removeIf(p -> p.getProductName().equals(productName));
    }

    public static void filterProduct(Scanner input){
        if(products.isEmpty()){
            System.out.println("Products list is empty");
            return;
        }
        System.out.println("1. Filter by price more than X");
        System.out.println("2. Filter by category");
        System.out.println("Enter choice: ");
        int choice = Integer.parseInt(input.nextLine());
        if(choice == 1){
            double price = Double.parseDouble(input.nextLine());
            products.stream()
                    .filter(product -> product.getPrice() > price)
                    .forEach(Product::displayData);
        }else if(choice == 2){
            Set<String> category = products.stream()
                    .map(Product::getCategory)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toSet());
            category.forEach(System.out::println);
        }else{
            System.out.println("Invalid choice");
        }
    }

    public static void sorter(Scanner input){
        if(products.isEmpty()){
            System.out.println("Products list is empty");
            return;
        }
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Enter choice: ");
        int choice = Integer.parseInt(input.nextLine());
        if(choice == 1){
            bubbleSortAscByPrice(products);
        }else if(choice == 2){
            bubbleSortDescByPrice(products);
        }else{
            System.out.println("Invalid choice");
        }
    }

    public static void bubbleSortAscByPrice(List<Product> products){
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public static void bubbleSortDescByPrice(List<Product> products){
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
