/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class DanhSachKH {
    ArrayList<KhachHang> listKH;
    Scanner sc = new Scanner(System.in);
    public DanhSachKH(){
        listKH = new ArrayList();
    }
    int count1 = 0, count2 = 0;
    double sum;
    public void input(){
        int choose;
        do{
            System.out.println("1. Khach Hang Viet Nam.");
            System.out.println("2. Khach Hang Nuoc Ngoai.");
            System.out.println("3. Thoat");
            choose = sc.nextInt();
            switch(choose){
                case 1:{
                    KHVietNam kh1 = new KHVietNam();
                    kh1.Nhap();
                    listKH.add(kh1);
                    count1++;
                }
                    break;
                case 2:{
                    KHNuocNgoai kh2 = new KHNuocNgoai();
                    kh2.Nhap();
                    listKH.add(kh2);
                    sum += kh2.ThanhTien();
                    count2++;
                }
                    break;
                default:
                    break;
            }
        }while(choose!=3);
    }
    
    public void output(){
        for(KhachHang kh: listKH){
            System.out.println(kh.toString());
        }
    }
    
    public void TrungBinhTT(){
        DecimalFormat f = new DecimalFormat("###,###");
        System.out.println("Trung Binh Thanh Tien Khach Hang Nuoc Ngoai: "+ f.format((sum/count2)));
    }
    public void SoLuong(){
        System.out.println("So Luong Khach Hang Viet Nam: "+ count1);
        System.out.println("So Luong Khach Hang Nuoc Ngoai: "+ count2);
    }
}
