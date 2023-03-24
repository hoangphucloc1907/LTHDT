/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai1;

/**
 *
 * @author sang
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    public String noiDen;
    public int soNgayDi;

    public ChuyenXeNgoaiThanh(){
        super();
        this.noiDen = "";
        this.soNgayDi = 0;
    }
    

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDi, String maSoChuyen, String soXe, String tenTaiXe, double doanhThu) {
        super(maSoChuyen, soXe, tenTaiXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Noi den: ");
        noiDen = sc.next();
        System.out.println("So ngay di: ");
        soNgayDi = sc.nextInt();
        
    }
    
    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh{" +super.toString()+ "noiDen=" + noiDen + ", soNgayDi=" + soNgayDi +  ", Doanh thu: "+this.doanhThu+'}';
    }

    
    
}
