/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_Lab6;

import java.util.Scanner;

/**
 *
 * @author sang
 */
public class NhanVien {
     String ten;
     long luong;
     
     Scanner sc = new Scanner(System.in);


    public NhanVien() {
        
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    
    public String loaiNhanVien(){
        return "Loai nv: ";
    }
    
    public void tinhLuong(long luong){
        this.luong = luong;
    }
    
    
    public void xuatThongTin(){
        System.out.println("Ten nhan vien: " + this.ten + ", Luong: " + this.luong );
    }
    
}
