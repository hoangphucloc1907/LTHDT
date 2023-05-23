/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author sang
 */
public class KHNuocNgoai extends KhachHang{
    private String quocTich;
    
    public KHNuocNgoai(){
        super();
        this.quocTich = "";
    }

    public KHNuocNgoai(String quocTich, int maKH, int soLuong, String hoTen, double donGia) {
        super(maKH, soLuong, hoTen, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
    public double ThanhTien(){
        return this.soLuong * this.donGia;
    }
    
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap Quoc Tich: ");
        setQuocTich(sc.nextLine());
    }

    @Override
    public String toString() {
        return "KHNuocNgoai{"+ super.toString() + ", Quoc Tich = " + quocTich + ", Thanh Tien =" + f.format(ThanhTien())+ '}';
    }
    
    
}
