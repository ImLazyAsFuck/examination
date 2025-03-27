package pressentation;

import bussiness.CustomerBusiness;
import entity.Customer;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement{
    public static List<Customer> customers = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;
        while(true){
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    customerManagement(input);
                    break;
                case 2:
                    orderManagement(input);
                    break;
                case 3:
                    System.out.println("Good bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void displayMenu(){
        System.out.println("----------------- Menu -----------------");
        System.out.println("1. Customer Management");
        System.out.println("2. Order Management");
        System.out.println("3. Exit");
    }

    public static void customerManagement(Scanner input){
        int choice;
        while(true){
            System.out.println("----------------- Customer Management ---------------");
            System.out.println("1. Customer List");
            System.out.println("2. Add Customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    CustomerBusiness.displayCustomers();
                    break;
                case 2:
                    CustomerBusiness.addCustomer(input);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void orderManagement(Scanner input){
        int choice;
        while(true){
            System.out.println("--------------- Order Management ---------------");
            System.out.println("1. Order List");
            System.out.println("2. Add Order");
            System.out.println("3. Update order status");
            System.out.println("4. Expired order list");
            System.out.println("5. Delivered order list statics");
            System.out.println("6. Total amount of orders");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
