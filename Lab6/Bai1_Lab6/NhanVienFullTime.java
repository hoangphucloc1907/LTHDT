/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_Lab6;

/**
 *
 * @author sang
 */
public class NhanVienFullTime extends NhanVien{
    private int loaiChucVu, ngayLamThem;
    private long luongFullTime = 2000;

    public NhanVienFullTime() {
    }
    
    
    
    

    public NhanVienFullTime(int loaiChucVu, int ngayLamThem, String ten) {
        super(ten);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    public int getLoaiChucVu() {
        return loaiChucVu;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }
    
    @Override
    public String loaiNhanVien(){
        return "Fulltime";
    }
    
   
    public void tinhLuong(){
        luong =  this.luongFullTime * this.loaiChucVu * this.ngayLamThem;
    }
    
    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Loai nhan vien: "+ loaiNhanVien()+", Loai chuc vu: " + this.loaiChucVu + ", Ngay Lam them " + this.ngayLamThem );
    }
    
}
