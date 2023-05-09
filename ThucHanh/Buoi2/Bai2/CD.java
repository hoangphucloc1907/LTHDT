/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class CD {
    private int id, quantity;
    private double price;
    private String name;
    
    public CD(){
        
    }
    
    public CD(int id){
        this.id = id;
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }
    
    public CD(int id, String name, int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0)
            this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0)
            this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static CD input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma CD: ");
        CD cd = new CD(sc.nextInt());
//        cd.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten CD: ");
        cd.setName(sc.nextLine());
        System.out.println("Nhap so luong CD: ");
        cd.setQuantity(sc.nextInt());sc.nextLine();
        System.out.println("Nhap gia thanh CD: ");
        cd.setPrice(sc.nextDouble());
        return cd;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof CD){
            CD another = (CD) obj;
            if(this.getId() == another.getId() ){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "CD{" + "id=" + id + ", quantity=" + quantity + ", price=" + price + ", name=" + name + '}';
    }
 
    
    
}
