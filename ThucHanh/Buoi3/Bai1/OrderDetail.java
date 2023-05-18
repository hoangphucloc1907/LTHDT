/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author sang
 */
public class OrderDetail {
    private int quantity;
    Product product;
    

    public OrderDetail(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double calcTotalPrice(){
        double thanhTien = quantity * product.getPrice();
        return thanhTien;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quantity=" + quantity + ", product=" + product + '}';
    }
    
    
}
