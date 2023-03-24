/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai1;

import java.util.Scanner;

/**
 *
 * @author sang
 */
public class ChuyenXe {
    public String maSoChuyen, soXe, tenTaiXe;
    public double doanhThu;
    
    Scanner sc = new Scanner(System.in);

    public ChuyenXe() {
        this.maSoChuyen = "";
        this.soXe = "";
        this.tenTaiXe = "";
        this.doanhThu = 0;
    }
    
    

    public ChuyenXe(String maSoChuyen, String soXe, String tenTaiXe, double doanhThu) {
        super();
        this.maSoChuyen = maSoChuyen;
        this.soXe = soXe;
        this.tenTaiXe = tenTaiXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public void nhap(){
        System.out.println("Ma so chuyen: ");
        maSoChuyen = sc.next();
        System.out.println("So xe: ");
        soXe = sc.next();
        System.out.println("Ten Tai xe: ");
        tenTaiXe = sc.next();
        System.out.println("Doanh thu: ");
        doanhThu = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "ChuyenXe{" + "maSoChuyen=" + maSoChuyen + ", soXe=" + soXe + ", tenTaiXe=" + tenTaiXe +'}';
    }
    
    
}
