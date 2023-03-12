/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaQua;

/**
 *
 * @author sang
 */
public class HoaQua {
    private double giaban, soluong;
    private String nguongoc, mausac;
    private int ngaynhap;

    public HoaQua() {
    }

    public HoaQua(double giaban, double soluong, String nguongoc, String mausac, int ngaynhap) {
        this.giaban = giaban;
        this.soluong = soluong;
        this.nguongoc = nguongoc;
        this.mausac = mausac;
        this.ngaynhap = ngaynhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public int getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(int ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    
    
}
