/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Lab6;

/**
 *
 * @author sang
 */
public class HocSinhChuyenToan extends HocSinh{

    public HocSinhChuyenToan(String hoTen, String lop, float toan, float ly, float hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }
    
    
    
    @Override
    public double diemTrungBinh(){
        double dtb = ((toan * 2)+ ly + hoa)/4;
        return dtb;
    }
    
}
