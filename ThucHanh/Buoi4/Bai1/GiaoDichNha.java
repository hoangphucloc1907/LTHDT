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
public class GiaoDichNha extends GiaoDich{
    private String diaChi;
    private int loaiNha;
    

    public GiaoDichNha() {
        super();
        this.loaiNha = 0;
    }

    public GiaoDichNha(String diaChi, int loaiNha, int maGD, LocalDate ngayGD, double donGia, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public double ThanhTien(){
        if(loaiNha == 1){
            return dienTich*donGia;
        }else{
            return dienTich*donGia*0.9;
        }
    }
    
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap loai nha: ");
        setLoaiNha(sc.nextInt());sc.nextLine();
        System.out.println("Nhap Dia Chi: ");
        setDiaChi(sc.nextLine());
    }

    @Override
    public String toString() {
        String loai;
        if(loaiNha == 1){
            loai = "Nha Cao Cap.";
        }else{
            loai = "Nha Thuong.";
        }
        return "Giao Dich Nha{" + super.toString() + ", Dia Chi=" + diaChi + ", Loai Nha=" + loai + ", Thanh Tien = " + f.format(ThanhTien()) +'}';
    }
    
    
}
