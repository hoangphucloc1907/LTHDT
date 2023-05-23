/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author sang
 */
public class KHVietNam extends KhachHang{
    private int doiTuong, dinhMuc;

    public KHVietNam(int doiTuong, int dinhMuc, int maKH, int soLuong, String hoTen, double donGia) {
        super(maKH, soLuong, hoTen, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }
    
    public KHVietNam(){
        super();
        this.doiTuong = 0;
        this.dinhMuc = 0;
    }

    public int getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(int doiTuong) {
        this.doiTuong = doiTuong;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    
    public double ThanhTien(){
        if(soLuong <= dinhMuc){
            return soLuong * donGia;
        }else{
            return ((soLuong * donGia * dinhMuc)+ ((dinhMuc - soLuong)* donGia *2.5));
        }
    }
    

    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap Doi Tuong: ");
        setDoiTuong(sc.nextInt());
        System.out.println("Nhap Dinh Muc: ");
        setDinhMuc(sc.nextInt());
    }

    @Override
    public String toString() {
        String loai;
        if(doiTuong == 1){
            loai = "Sinh Hoat";
        }else if(doiTuong == 2){
            loai = "Kinh Doanh";
        }else{
            loai = "San Xuat";
        }
        return "KHVietNam{"+ super.toString() + ", Doi Tuong=" + loai + ", Dinh Muc=" + dinhMuc + ", Thanh Tien = " + f.format(ThanhTien()) + '}';
    }
}
