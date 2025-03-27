package bussiness;

import entity.Customer;
import entity.Order;
import pressentation.ShopManagement;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CustomerBusiness{

    public static void addCustomer(Scanner input){
        Customer newCustomer = new Customer();
        newCustomer.inputData(input);
        ShopManagement.customers.add(newCustomer);
        System.out.println("Customer added successfully");
    };

    public static void displayCustomers(){
        if(ShopManagement.customers.isEmpty()){
            System.out.println("Customer list is empty");
            return;
        }
        System.out.println("Customer list: ");
        ShopManagement.customers.forEach(c -> {
            System.out.println(c.toString() + "Total: " +
                    ShopManagement.orders.stream()
                            .filter(o ->
                            o.getCustomer().equals(c))
                    + "expired Date: " +
                    ShopManagement.orders.stream()
                            .filter(o ->
                            o.getCustomer().equals(c)
                                    && !o.getStatus()
                                    && o.getOrderDate().isAfter(LocalDate.now()))
                    .count());
        });
    };
}
