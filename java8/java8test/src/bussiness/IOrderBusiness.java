package bussiness;

import entity.Order;

import java.util.List;
import java.util.Scanner;

public interface IOrderBusiness{
    void addOrder(Scanner input);
    void displayOrders();
    void updateOrder(Scanner input);
    List<Order> getOrderOverdue();
    List<Order> getOrderDelivied();
    default double getTotalRevenue(){
        return 0;
    }

}
