/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.time.LocalDate;
/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, LocalDate.now());
        order.addlineItem(new Product("sp4","Nuoc tuong", 8000), 10);
        order.addlineItem(new Product("sp1", "Gao", 18000), 5);
        order.addlineItem(new Product("sp3", "Duong", 10000), 1);
        order.addlineItem(new Product("sp1", "Gao", 18000), 1);
        order.addlineItem(new Product("sp2", "Muoi", 9000), 1);
        order.addlineItem(new Product("sp5", "Cocacola", 12000), 6);
        order.addlineItem(new Product("sp6", "Pepsi", 13000), 8);
        System.out.printf("Ma HD: %d\n", order.getOrderID());
        System.out.println("Ngay lap hoa don: "+ order.formatDate());
        order.output();
        

    }
    
}
