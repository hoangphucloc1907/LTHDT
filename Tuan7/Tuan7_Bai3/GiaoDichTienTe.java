/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai3;

/**
 *
 * @author sang
 */
public class GiaoDichTienTe extends GiaoDich {
    private float tiGia;
    private int loaiTienTe;

    public GiaoDichTienTe() {
        super();
        this.tiGia = 0;
        this.loaiTienTe = 0;
    }

    public GiaoDichTienTe(float tiGia, int loaiTienTe, String ngayGiaoDich, double donGia, double thanhTien, int maGiaoDich, int soLuong) {
        super(ngayGiaoDich, donGia, thanhTien, maGiaoDich, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public int getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(int loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }
    
    public void nhap(){
        super.nhap();
        System.out.println("Ti gia: ");
        tiGia = sc.nextFloat();
        System.out.println("Loai tien te: ");
        loaiTienTe = sc.nextInt();
    }
    
    public double ThanhTien(){
        if(loaiTienTe == 1){
            return this.thanhTien = this.donGia * this.soLuong;
        }else{
            return this.thanhTien = this.donGia * this.soLuong * this.tiGia;
        }
    }

    @Override
    public String toString() {
        String tien;
        if(loaiTienTe == 1){
            tien = "VND";
        }else if (loaiTienTe == 2){
            tien = "USD";
        }else{
            tien = "EURO";
        }
        
        return "GiaoDichTienTe{" + super.toString() + " tiGia=" + tiGia + ", loaiTienTe=" + tien + ", Thanh tien: "+ thanhTien +'}';
    }
    
    
    
    
}
