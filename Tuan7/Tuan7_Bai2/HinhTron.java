/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai2;

import java.util.Scanner;

/**
 *
 * @author sang
 */
public class HinhTron extends Hinh{
    public float r; 

    public HinhTron(float r) {
        this.r = r;
    }

    public HinhTron() {
    }

    @Override
    public double DienTich(){
        return PI * r * r;
    }
    
    public void nhapHinhTron(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        r = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "HinhTron{" + "ban kinh = " + r + "Dien tich = " + DienTich() + '}';
    }
    
    
}
