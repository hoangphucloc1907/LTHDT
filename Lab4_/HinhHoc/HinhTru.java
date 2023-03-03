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
public class HinhTru extends HinhTron{
    public float chieuCao;
    
    public HinhTru(){
        
    }
    
    public void nhapChieuCao(){
        nhapBanKinh();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao = ");
        chieuCao = sc.nextFloat();
    }
    
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
