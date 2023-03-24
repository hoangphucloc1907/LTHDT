/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai3;

import java.util.Scanner;

/**
 *
 * @author sang
 */
public class Main {

    public static void main(String[] args) {
        DanhSachGD dsgd = new DanhSachGD();
        Scanner in = new Scanner(System.in);
        
        dsgd.nhap(5);
        dsgd.xuat();
        dsgd.TongSoLuong();
        dsgd.TrungBinhGDTT();
        dsgd.GiaoDich1ty();
    }
}
