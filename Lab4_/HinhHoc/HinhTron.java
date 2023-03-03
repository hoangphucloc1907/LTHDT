/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhHoc;
import java.util.Scanner;
/**
 *
 * @author sang
 */
public class HinhTron extends HinhHoc{
    public float banKinh;
    
    public HinhTron(){
        
    }
    
    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh = ");
        banKinh = sc.nextFloat();
    }
    
    public void tinhChuVi(){
        chuVi = 2 * PI * banKinh;
    }
    
    public void tinhDienTich(){
        dienTich = PI * banKinh * banKinh;
    }
}
