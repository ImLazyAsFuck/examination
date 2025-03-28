import business.ProductManagement;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;
        while(true){
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    ProductManagement.displayData();
                    break;
                case 2:
                    ProductManagement.addProduct(input);
                    break;
                case 3:
                    ProductManagement.updateProduct(input);
                    break;
                case 4:
                    ProductManagement.deleteProductById(input);
                    break;
                case 5:
                    ProductManagement.deleteProductByName(input);
                    break;
                case 6:
                    ProductManagement.filterProduct(input);
                    break;
                case 7:
                    ProductManagement.sorter(input);
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void displayMenu(){
        System.out.println("---------------- Menu --------------");
        System.out.println("1. Display Products");
        System.out.println("2. Add Product");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product By ID");
        System.out.println("5. Search Product By Name");
        System.out.println("6. Filter Products");
        System.out.println("7. Sort Products");
        System.out.println("8. Exit");
    }
}
