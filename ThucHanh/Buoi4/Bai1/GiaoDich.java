/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class GiaoDich {

    public int maGD;
    public LocalDate ngayGD = LocalDate.now();
    public double donGia, dienTich;

    Scanner sc = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DecimalFormat f = new DecimalFormat("###,###");

    public GiaoDich(int maGD, LocalDate ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public GiaoDich() {
        LocalDate ngayGD = LocalDate.now();
    }

    public int getMaGD() {
        return maGD;
    }

    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }

    public LocalDate getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(LocalDate ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void Nhap() {
        System.out.println("Nhap ma GD: ");
        setMaGD(sc.nextInt());
        System.out.println("Nhap Don Gia: ");
        setDonGia(sc.nextDouble());
        System.out.println("Nhap Dien Tich: ");
        setDienTich(sc.nextDouble());

    }

    @Override
    public String toString() {
        return "Ngay GD: " + dtf.format(ngayGD) + ", Ma GD=" + maGD + ", Don Gia=" + f.format(donGia) + ", Dien Tich=" + f.format(dienTich) ;
    }

}
