/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class DanhSachGD {
    ArrayList<GiaoDich> listGD;
    Scanner sc = new Scanner(System.in);
    GiaoDich gd;
    int chon, sum1 = 0, sum2 = 0, sumtien = 0,dem = 0;

    public DanhSachGD() {
        super();
        listGD = new ArrayList<GiaoDich>();
    }
    
    public void nhap(int n){
        for(int i =0; i<n; i++){
            System.out.println("1. Giao Dich Vang.");
            System.out.println("2. Giao Dich Tien Te. ");
            System.out.println("0. Thoat.");
            chon = sc.nextInt();
            switch(chon){
                case 1:{
                    GiaoDichVang gdv = new GiaoDichVang();
                    gdv.nhap();
                    gdv.thanhTien = gdv.ThanhTien();
                    listGD.add(gdv);
                    sum1 += gdv.soLuong;
                }
                    break;
                
                case 2:{
                    GiaoDichTienTe gdtt = new GiaoDichTienTe();
                    gdtt.nhap();
                    gdtt.thanhTien = gdtt.ThanhTien();
                    listGD.add(gdtt);
                    sumtien += gdtt.thanhTien;
                    sum2 += gdtt.soLuong;
                    dem++;
                }
                    break;
                
                default:
                    break;
            }
        }
    }
    
    public void xuat(){
        for(GiaoDich gd : listGD){
            System.out.println(gd.toString());
        }
    }
    
    public void TongSoLuong(){
        System.out.println("Tong so luong giao dich vang: "+ sum1);
        System.out.println("Tong so luonh giao dich tien te: "+ sum2);
    }
    
    public void TrungBinhGDTT(){
        System.out.println("Trung binh GDTT: "+ (sumtien/dem));
    }
    
    public void GiaoDich1ty(){
        int d =0;
        for(GiaoDich gd : listGD){
            if(gd.donGia > 1000){
                System.out.println("Don gia lon hon 1ty: "+ gd.toString());
                d++;
            }
        }
    }
}
        
          



