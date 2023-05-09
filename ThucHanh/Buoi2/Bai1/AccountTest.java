/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class AccountTest {
    
    public static void main(String[] args) {
        
        showMenu();
    }
    

    public static void showMenu(){
        AccountList list = new AccountList();
        Scanner sc = new Scanner(System.in);
        int choose ;
        
        do{
            
        System.out.println("1. Them Tai Khoan");
        System.out.println("2. So TK Hien Co");
        System.out.println("3. In Thong Tin Tat Ca Tai Khoan");
        System.out.println("4. Nap Tien.");
        System.out.println("5. Rut Tien.");
        System.out.println("6. Chuyen Tien");
        System.out.println("7. Ket Thuc");
        System.out.print("Chon Chuc Nang.");
            choose = sc.nextInt();
            switch (choose){
                case 1:{
                    list.addAccount();
                    
                    
                }
                    break;
                
                
                case 2:
                    System.out.format("So TK hien co trong ngan hang: %d\n",list.size());
                    break;  
                    
                case 3:
                    list.output();
                    break;
                    
                case 4:{
                    System.out.println("Nhap STK nap: ");
                    Account acc = list.getSTK(sc.nextLong());

                    
                    if(acc == null){
                        System.out.println("Khong tim thay tai khoan.");break;
                    }
                    System.out.println("Nhap so tien nap: ");
                    acc.napTien(sc.nextDouble());
                    
                }
                    break;
                    
                case 5:{
                    System.out.println("Nhap STK rut: ");
                    Account acc = list.getSTK(sc.nextLong());
                    if(acc == null){
                        System.out.println("Khong tim thay tai khoan.");break;
                    }
                    System.out.println("Nhap so tien rut: ");
                    acc.rutTien(sc.nextDouble());
                }
                    break;  
                    
                case 6:{
                    System.out.println("Nhap STK chuyen: ");
                    Account acc1 = list.getSTK(sc.nextLong());
                    System.out.println("Nhap STK nhan: ");
                    Account acc2 = list.getSTK(sc.nextLong());
                    if(acc1 == null || acc2 == null){
                        System.out.println("Khong tim thay tai khoan"); break;
                    }
                    System.out.println("Nhap so tien chuyen: ");
                    if(Account.chuyenTien(acc1, acc2, sc.nextDouble()))
                        System.out.println("Chuyen Tien Thanh Cong");
                    else
                        System.out.println("That Bai");
                }
                
                    break;
                    
                default:
                    break;
            }
        }while(choose != 7);
    }
    
}
