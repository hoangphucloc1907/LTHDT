/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author sang
 */
public class QuanLyPhongHoc {
    ArrayList<PhongHoc> listPH;
    
    public QuanLyPhongHoc(){
        listPH = new ArrayList<>();
    }
    
    public boolean themPhongHoc(PhongHoc phongHoc){
        for(PhongHoc ph : listPH){
            if(ph.getMaPhong().equals(phongHoc.getMaPhong())){
                return false;
            }
        }
        listPH.add(phongHoc);
        return true;
    }
    
    public PhongHoc timPhongHoc(String maPhong){
        for(PhongHoc ph : listPH){
            if(ph.getMaPhong().equals(maPhong)){
                return ph;
            }
        }
        return null;
    }
    
    public void inDanhSach(){
        System.out.printf("%-10s %-10s %10s %10s \n", "Ma Phong","Day Nha", "Dien Tich", "So Bong Den");
        for(PhongHoc ph : listPH){
            System.out.format("%-10s %-10s %10.2f %10d \n",
                    ph.getMaPhong(),
                    ph.getDayNha(),
                    ph.getDienTich(),
                    ph.getSoBongDen());
        }
        
    }
    
    public void tangDanTheoDayNha(){
        listPH.sort(Comparator.comparing(PhongHoc ::getDayNha));
    }
    
    public void giamDanTheoDienTich(){
        listPH.sort(Comparator.comparing(PhongHoc ::getDienTich).reversed());
    }
    
    public void tangDanTheoBongDen(){
        listPH.sort(Comparator.comparing(PhongHoc ::getSoBongDen));
    }
    
    public boolean capNhatMayTinh(String maPhong, int soMayTinh){
        PhongHoc ph = timPhongHoc(maPhong);
        if(ph != null){
            ((PhongMayTinh) ph).setMayTinh(soMayTinh);
            return true;
        }
        return false;
    }
    
    public boolean xoaPhongHoc(String maPhong){
        for(PhongHoc ph : listPH){
            if(ph.getMaPhong().equals(maPhong)){
                listPH.remove(ph);
                return true;
            }
        }
        return false;
    }
    
    public void inTongSoPhong(){
        System.out.println("Tong So Phong Hoc: " + listPH.size());
    }
    
    public List<PhongHoc> phongDatChuan(){
        List<PhongHoc> listDatChuan = new ArrayList<>();
        for(PhongHoc ph : listPH){
            if(ph.datChuan()){
                listDatChuan.add(ph);
            }
        }
        return listDatChuan;
    }
    
    
    
}
