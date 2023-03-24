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
public class HinhChuNhat extends Hinh{
    public float cd, cr;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }
    public void nhapHinhChuNhat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: " );
        cd = sc.nextFloat();
        System.out.println("Nhap chieu rong: " );
        cr = sc.nextFloat();

    }

    @Override
    public double DienTich(){
        return cd * cr;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "chieu dai = " + cd + ", chieu rong = " + cr + ", Dien tich = " + DienTich() + '}';
    }

    
    
    
}
