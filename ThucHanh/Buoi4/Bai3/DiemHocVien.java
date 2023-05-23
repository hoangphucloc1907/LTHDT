/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
/**
 *
 * @author sang
 */
public class DiemHocVien {

    private String hoTen;
    private int namSinh;
    private double diemMon1,diemMon2,diemMon3,diemMon4,diemMon5;

    public DiemHocVien(String hoTen, int namSinh, double diemMon1, double diemMon2, double diemMon3, double diemMon4, double diemMon5) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
        this.diemMon4 = diemMon4;
        this.diemMon5 = diemMon5;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public double getDiemMon3() {
        return diemMon3;
    }

    public double getDiemMon4() {
        return diemMon4;
    }

    public double getDiemMon5() {
        return diemMon5;
    }

    public double tinhDiemTrungBinh() {
        return (diemMon1 + diemMon2 + diemMon3 + diemMon4 + diemMon5) / 5.0;
    }

    public boolean monDuoiDiem5() {
        return (diemMon1 < 5 || diemMon2 < 5 || diemMon3 < 5 || diemMon4 < 5 || diemMon5 < 5);
    }

    @Override
    public String toString() {
        return "DiemHocVien{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemMon1=" + diemMon1 + ", diemMon2=" + diemMon2 + ", diemMon3=" + diemMon3 + ", diemMon4=" + diemMon4 + ", diemMon5=" + diemMon5 + '}';
    }
    
    
}

