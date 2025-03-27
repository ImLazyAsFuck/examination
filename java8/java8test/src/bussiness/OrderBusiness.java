package bussiness;

import entity.Order;

import java.util.List;
import java.util.Scanner;

public class OrderBusiness implements IOrderBusiness{

    @Override
    public void addOrder(Scanner input){

    }

    @Override
    public void displayOrders(){

    }

    @Override
    public void updateOrder(Scanner input){

    }

    @Override
    public List<Order> getOrderOverdue(){
        return List.of();
    }

    @Override
    public List<Order> getOrderDelivied(){
        return List.of();
    }

    @Override
    public double getTotalRevenue(){
        return 0;
    }
}
