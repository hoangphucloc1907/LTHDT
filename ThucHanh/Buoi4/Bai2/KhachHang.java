/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class KhachHang {
    public int maKH, soLuong;
    public String hoTen;
    public double donGia;
    public LocalDate date = LocalDate.now();
    
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DecimalFormat f = new DecimalFormat("###,###");

    public KhachHang() {
    }

    public KhachHang(int maKH, int soLuong, String hoTen, double donGia) {
        this.maKH = maKH;
        this.soLuong = soLuong;
        this.hoTen = hoTen;
        this.donGia = donGia;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public void Nhap(){
        System.out.println("Nhap Ma KH: ");
        setMaKH(sc.nextInt());sc.nextLine();
        System.out.println("Nhap Ho Ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Nhap So KW: ");
        setSoLuong(sc.nextInt());
        System.out.println("Nhap Don Gia: ");
        setDonGia(sc.nextDouble());sc.nextLine();
    }

    @Override
    public String toString() {
        return " Ngay Ra Hoa Don = " + dtf.format(date) + ", Ma KH=" + maKH + ", Ho Ten=" + hoTen +", So Luong KW =" + f.format(soLuong) + ", Don Gia=" + f.format(donGia) ;
    }
    
    
}
