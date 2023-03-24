/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai1;

/**
 *
 * @author sang
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
    public int soTuyen;
    public float km;

    public ChuyenXeNoiThanh() {
        super();
        this.soTuyen = 0;
        this.km = 0;
    }
    
    

    public ChuyenXeNoiThanh(int soTuyen, float km, String maSoChuyen, String soXe, String tenTaiXe, double doanhThu) {
        super(maSoChuyen, soXe, tenTaiXe, doanhThu);
        this.soTuyen = soTuyen;
        this.km = km;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("So tuyen: ");
        soTuyen = sc.nextInt();
        System.out.println("So Km: ");
        km = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" +super.toString()+ "soTuyen=" + soTuyen + ", km=" + km + ", Doanh thu: "+this.doanhThu+  '}';
    }

   
}
