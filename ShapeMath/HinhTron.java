/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeMath;

/**
 *
 * @author sang
 */
public class HinhTron {
    private int BanKinh;
    private String MauSac;

    public HinhTron() {
        BanKinh=0;
        MauSac=null;
    }

    public HinhTron(int BanKinh, String MauSac) {
        this.BanKinh = BanKinh;
        this.MauSac = MauSac;
    }
    public HinhTron(HinhTron ht) {
        BanKinh = ht.BanKinh;
        MauSac = ht.MauSac;
    }

    public int getBanKinh() {
        return BanKinh;
    }

    public void setBanKinh(int BanKinh) {
        this.BanKinh = BanKinh;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }
    public float S(){
        return (float) (3.14*BanKinh*BanKinh);
    }
    @Override
    public String toString(){
        return "Ban kinh: "+BanKinh+"\nMau: "+MauSac;
    }
}

