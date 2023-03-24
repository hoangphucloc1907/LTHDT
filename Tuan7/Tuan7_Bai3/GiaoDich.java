/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai3;

import java.util.Scanner;

/**
 *
 * @author sang
 */
public class GiaoDich {
    public String ngayGiaoDich;
    public double donGia, thanhTien;
    public int maGiaoDich, soLuong;
    
    Scanner sc = new Scanner(System.in);


    public GiaoDich() {
        super();
        this.maGiaoDich = 0;
        this.donGia = 0;
        this.soLuong = 0;
        this.thanhTien = 0;
        this.ngayGiaoDich = ""; 
    }

    public GiaoDich(String ngayGiaoDich, double donGia, double thanhTien, int maGiaoDich, int soLuong) {
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
        this.maGiaoDich = maGiaoDich;
        this.soLuong = soLuong;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void nhap(){
        System.out.println("Ma GD: ");
        maGiaoDich = sc.nextInt();
        System.out.println("Ngay GD: ");
        ngayGiaoDich = sc.next();
        System.out.println("Don gia: ");
        donGia = sc.nextDouble();
        System.out.println("So luong: ");
        soLuong= sc.nextInt();
    }

    @Override
    public String toString() {
        return "GiaoDich{" + " ngayGiaoDich = " + ngayGiaoDich + ", donGia = " + donGia + 
                ", maGiaoDich = " + maGiaoDich + ", soLuong = " + soLuong + '}';
    }
    
    
    
}
