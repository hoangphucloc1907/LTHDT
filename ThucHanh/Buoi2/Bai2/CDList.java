/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//import java.util.*;

/**
 *
 * @author sang
 */
public class CDList {
    private double total;
    ArrayList<CD> cdList;
    
    
    public CDList(){
        cdList = new ArrayList<>();
    }
    
    public boolean addCD(CD cd){

        if(cdList.contains(cd)){ 
            System.out.println("ID da ton tai\nKhong duoc them vao danh sach");
            return false;     
            
        }
            total += cd.getPrice();
            return cdList.add(cd);
    }
    
    public double getTotal(){
        return total;
    }
    
    public int size(){
        return cdList.size();
    }
    
    public void descendByPrice(){
        cdList.sort(Comparator.comparing(CD ::getPrice).reversed());
        System.out.println("Sap xep thanh cong");
    }
    
    public void ascendByName(){
        cdList.sort(Comparator.comparing(CD :: getName));
        System.out.println("Sap xep thanh cong");

        
    }
    
    public void output(){
        System.out.printf("%-20s %-20s %20s %20s \n", "Ma CD", "Ten CD", "So Luong CD", "Gia Thanh");
        for(CD cd : cdList){
            System.out.format("%-20d %-20s %20d %20.2f \n", cd.getId(), cd.getName(), cd.getQuantity(), cd.getPrice());
        }
    }
}
