/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Lab6;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        HocSinh HS = new HocSinh("Phuc Loc", "CNTT2", 7, 8, 9);
        System.out.println("Ten: "+HS.getHoTen()+", Lop: " +HS.getLop()+ ", Diem Trung Binh: "+ HS.diemTrungBinh());
        
        HocSinhChuyenToan HSCT = new HocSinhChuyenToan("Phuc Loc", "CNTT2", 9, 7, 6);
        System.out.println("Ten: "+HSCT.getHoTen()+ ", Lop: "+HSCT.getLop()+", Diem Trung Binh: "+ HSCT.diemTrungBinh());
    }
    
}
