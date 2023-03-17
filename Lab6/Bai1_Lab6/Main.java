/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_Lab6;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        NhanVienFullTime NVFT = new NhanVienFullTime(1, 8, "Loc");
        NVFT.tinhLuong();
        NVFT.xuatThongTin();
        
        NhanVienPartTime NVPT = new NhanVienPartTime(4, "Hoang");
        NVPT.tinhLuong();
        NVPT.xuatThongTin();
        
        
        
    }
}
