/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhLuongNV;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        NhanVien nv=new NhanVien("Loc",5000,3,100000);
        
        nv.tangLuong(2.5);
        nv.inTTin();
        System.out.println("Luong nhan vien "+ nv.getTenNhanVien() + ": "+ nv.tinhLuong());
    }
}
