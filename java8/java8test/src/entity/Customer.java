package entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp{
    private static int id_count = 0;
    private int customerId;
    private String customerName;
    private Optional<String> email;

    public Customer(int customerId, String customerName, Optional<String> email){
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
    }

    public Customer(){
    }

    public static int getId_count(){
        return id_count;
    }

    public static void setId_count(int id_count){
        Customer.id_count = id_count;
    }

    public int getCustomerId(){
        return customerId;
    }

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public Optional<String> getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = Optional.ofNullable(email);
    }

    @Override
    public void inputData(Scanner input){
        this.customerId = ++id_count;
        System.out.print("Enter customer name: ");
        this.customerName = input.nextLine();
        System.out.print("Enter email: ");
        this.email = Optional.of(input.nextLine());
    }

    @Override
    public String toString(){
        return "Customer: " + customerId + ", " + customerName + ", " + email + ", " + email.map(String::valueOf).orElse("N/A");
    }
}
