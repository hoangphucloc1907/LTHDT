/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author sang
 */
public class Order {
    private int orderID;
    private LocalDate orderDate;
    private int count = 1;
    private double total = 0;
    OrderDetail orderdetail;
    
    ArrayList<OrderDetail> lineItems = new ArrayList<>();
    
    public Order(int orderID, LocalDate orderDate) {
        super();
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total += total ;
    }
    
    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    
    public void addlineItem(Product p, int x){
        lineItems.add(new OrderDetail(x, p));
     
    }
    
    public double calcTotalPrice(int quantity, double price){
        return quantity*price;
    }
    
//    public double calcTotalCharge(double total, double thanhtien){
//        return total + thanhtien;
//    }
    
    public String formatDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ngay = dtf.format(orderDate);
        return ngay;
    }
    
    public void output(){
        DecimalFormat f = new DecimalFormat("###,###");
        System.out.printf("%-5s | %-5s | %-15s | %15s | %15s | %15s\n","STT", "Ma SP", "Mo ta","Don gia","So luong", "Thanh tien");
        for(OrderDetail orderdetail : lineItems){
            System.out.printf("%-5d | %-5s | %-15s | %15s | %15d | %15s\n",
                    count,
                    orderdetail.product.getProductID(),
                    orderdetail.product.getDescription(),
                    f.format(orderdetail.product.getPrice()),
                    orderdetail.getQuantity(),
                    f.format(calcTotalPrice(orderdetail.getQuantity(), orderdetail.product.getPrice())));
            count++;
            setTotal(calcTotalPrice(orderdetail.getQuantity(), orderdetail.product.getPrice()));
            
            
        }
        System.out.printf("Tong Thanh Tien Thanh Toan: %s\n",f.format(getTotal()));
    }

       
}
