/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sang
 */
public class HocVien {
private List<DiemHocVien> list;

    public HocVien() {
        list = new ArrayList<>();
    }

    public void themDiemHocVien(DiemHocVien diemHocVien) {
        list.add(diemHocVien);
    }

    public int luanVan() {
        int count = 0;
        for (DiemHocVien diemHocVien : list) {
            if (!diemHocVien.monDuoiDiem5() && diemHocVien.tinhDiemTrungBinh() > 7) {
                count++;
            }
        }
        return count;
    }

    public int thiTN() {
        int count = 0;
        for (DiemHocVien diemHocVien : list) {
            if (!diemHocVien.monDuoiDiem5() && diemHocVien.tinhDiemTrungBinh() <= 7) {
                count++;
            }
        }
        return count;
    }

    public int thiLai() {
        int count = 0;
        for (DiemHocVien diemHocVien : list) {
            if (diemHocVien.monDuoiDiem5()) {
                count++;
            }
        }
        return count;
    }
    
    public void output(){
        for (DiemHocVien dhv : list){
            System.out.println(dhv.toString());
        }
    }
    
    public void monThiLai(){
        for (DiemHocVien dhv : list){
            if(dhv.getDiemMon1() < 5)
                System.out.println("Mon 1");
            if(dhv.getDiemMon2() < 5)
                System.out.println("Mon 2");
            if(dhv.getDiemMon3() < 5)
                System.out.println("Mon 3");
            if(dhv.getDiemMon4() < 5)
                System.out.println("Mon 4");
            if(dhv.getDiemMon5() < 5)
                System.out.println("Mon 5");
        }
    }
}
