/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1A;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class Vehicle {
    private String tenChuXe, loaiXe;
    private int dungTich;
    private double giaXe, thue;
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,##0.00");

    public Vehicle() {
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double giaXe, double thue) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.giaXe = giaXe;
        this.thue = thue;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }


    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
    
    public double getThueMuaXe(){
        if (dungTich < 100){
            this.thue = this.giaXe * 0.1;
        }else if(dungTich >= 100 && dungTich <= 200){
            this.thue = this.giaXe * 0.3;
        }else{
            this.thue = this.giaXe * 0.5;
        }
        return thue;
    }
    
    public void nhap(){
        System.out.println("Nhap ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.println("Nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.println("Nhap dung tich XyLanh: ");
        dungTich = sc.nextInt();
        System.out.println("Nhap gia xe: ");
        giaXe = sc.nextDouble();
    }

    
//    public void xuat(){
//        
//        System.out.print("" + this.tenChuXe+ "\t\t");
//        System.out.print("\t"+ this.loaiXe + "");
//        System.out.print("\t\t"+ this.dungTich + "\t\t");
//        System.out.print("\t"+ df.format(this.giaXe)+"\t\t");
//        System.out.print("\t" + df.format(this.getThueMuaXe()) + "\n");
//    }
    
    
}
