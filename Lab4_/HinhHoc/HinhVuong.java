/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhHoc;

import java.util.Scanner;

/**
 *
 * @author sang
 */
public class HinhVuong extends HinhChuNhat{
    
    public HinhVuong(){
        
    }
    
    public void nhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh = ");
        dai = rong = sc.nextFloat();
    }
}
