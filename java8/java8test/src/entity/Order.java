package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Order implements IApp{
    private int orderIdCounter = 0;
    private int orderId;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private Boolean status;

    public Order(){
    }

    public Order(int orderIdCounter, int orderId, Customer customer, LocalDate orderDate, double totalAmount, Boolean status){
        this.orderIdCounter = orderIdCounter;
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getOrderIdCounter(){
        return orderIdCounter;
    }

    public void setOrderIdCounter(int orderIdCounter){
        this.orderIdCounter = orderIdCounter;
    }

    public int getOrderId(){
        return orderId;
    }

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public LocalDate getOrderDate(){
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate){
        this.orderDate = orderDate;
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    @Override
    public void inputData(Scanner input){
        this.orderId = ++orderIdCounter;
        this.orderDate = LocalDate.now();
        System.out.print("Total amount: ");
        this.totalAmount = input.nextDouble();
    }

    @Override
    public String toString(){
        return "Order{" +
                "orderIdCounter=" + orderIdCounter +
                ", orderId=" + orderId +
                ", customer=" + customer +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", status=" + status +
                '}';
    }
}
