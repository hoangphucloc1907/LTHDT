/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_Lab7;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        HangSanXuat hsx1 = new HangSanXuat("A", "VN");        
        HangSanXuat hsx2 = new HangSanXuat("B", "US");
        HangSanXuat hsx3 = new HangSanXuat("C", "CN");

        PhuongTienDiChuyen p1 = new MayBay("Xang", hsx1);
        PhuongTienDiChuyen p2 = new XeOto("Xang", hsx2);
        PhuongTienDiChuyen p3 = new XeDap( hsx3);
        
        System.out.println("P1: "+p1.layVanToc()+ p1.layTenHangSanXuat());
    }
}
