/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai3;

/**
 *
 * @author sang
 */
public class GiaoDichVang extends GiaoDich{
    private String loaiVang;


    public GiaoDichVang() {
        super();
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang(String loaiVang, String ngayGiaoDich, double donGia, double thanhTien, int maGiaoDich, int soLuong) {
        super(ngayGiaoDich, donGia, thanhTien, maGiaoDich, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Loai vang: ");
        loaiVang = sc.next();
    }
    
    public double ThanhTien(){
        return this.thanhTien = this.soLuong * this.donGia;
    }

    @Override
    public String toString() {
        return "GiaoDichVang{" + super.toString() + " loaiVang = " + loaiVang + ", Thanh tien = "+ thanhTien + '}';
    }
    
    
    
    
}
