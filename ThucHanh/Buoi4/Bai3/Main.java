/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.List;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        HocVien hv = new HocVien();

        // Thêm các học viên vào lớp học
        hv.themDiemHocVien(new DiemHocVien("Nguyen Van A", 2003, 8, 7, 9, 6, 8));
        hv.themDiemHocVien(new DiemHocVien("Tran Van B", 2003, 6, 5, 6, 7, 8));
        hv.themDiemHocVien(new DiemHocVien("Le Van C", 2003, 8, 9, 5, 4, 8));
        hv.themDiemHocVien(new DiemHocVien("Pham Thi D", 2003, 7, 6, 5, 7, 6));
        hv.output();
        System.out.println("So nguoi lam luan van: " + hv.luanVan());
        System.out.println("So nguoi thi tot nghiep: " + hv.thiTN());
        System.out.println("so nguoi thi lai: " + hv.thiLai());
        System.out.println("Danh sach mon thi lai: ");
        hv.monThiLai();
    }
}
