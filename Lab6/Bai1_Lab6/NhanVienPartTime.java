/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_Lab6;

/**
 *
 * @author sang
 */
public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;
    private long luongPartTime = 1000;

    public NhanVienPartTime(int gioLamViec, String ten) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }
    
    @Override
    public String loaiNhanVien(){
        return "PartTime";
    }
    
    
    public void tinhLuong(){
         luong = this.luongPartTime*this.gioLamViec;
    }
    
    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Loai nhan vien: "+ loaiNhanVien()+", Gio lam viec: " + this.gioLamViec );
    }
    
}
