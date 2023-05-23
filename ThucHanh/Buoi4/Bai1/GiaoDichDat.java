/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.time.LocalDate;

/**
 *
 * @author sang
 */
public class GiaoDichDat extends GiaoDich{
    private int loaiDat;

    public GiaoDichDat(int loaiDat, int maGD, LocalDate ngayGD, double donGia, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
    }
    
    public GiaoDichDat(){
        super();
        this.loaiDat = 0;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    public double ThanhTien(){
        if(loaiDat == 1){
            return this.dienTich * this.donGia* 1.5;
        }
        else{
            return dienTich*donGia;
        }
    }
    
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap Loai Dat: ");
        setLoaiDat(sc.nextInt());
    }

    @Override
    public String toString() {
        String loai;
        if(loaiDat == 1){
            loai = "A";
        }else{
            loai= "B, C. ";
        }
        return "GiaoDichDat{" + super.toString() + ", Loai Dat=" + loai + ", Thanh Tien = " + f.format(ThanhTien());
    }
    
    
}
