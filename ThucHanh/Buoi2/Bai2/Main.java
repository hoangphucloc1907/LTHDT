/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        showMenu();          
    }
    
    
    public static void showMenu(){
                
        CDList list = new CDList();
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("1. Them CD");
            System.out.println("2. So Luong CD Hien Co");
            System.out.println("3. Tinh Tong Gia Thanh ");
            System.out.println("4. Sap Xep Giam Dan Theo Gia");
            System.out.println("5. Sap Xep Tang Dan Theo Ten");
            System.out.println("6. In Danh Sach CD");
            System.out.println("7. Ket Thuc");
            
            choose = sc.nextInt();
            switch(choose){
                case 1:{
                    list.addCD(CD.input());
                }
                    break;
                
                case 2:
                    System.out.printf("So luong CD hien co %d\n",list.size());
                    break;
                
                case 3:
                    System.out.printf("Tong gia thanh la %.2f\n ", list.getTotal());
                    break;
                case 4:
                    list.descendByPrice();
                    break;
                
                case 5:
                    list.ascendByName();
                    break;
                
                case 6:{
                    list.output();
                    break;
                }
                default:
                    break;
                
            }
        }while(choose != 7);
    }
}

