/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class DanhSachChuyenXe {
    ArrayList<ChuyenXe> listChuyenXe;
    double sum1 = 0, sum2 = 0;
    int chon;
    Scanner sc;
    
    public DanhSachChuyenXe(){
        super();
        listChuyenXe = new ArrayList<ChuyenXe>();
        sc = new Scanner(System.in);
    }
    
    public void nhap(int n){
        for(int i=0; i<n; i++){
            System.out.println("1. Chuyen xe noi thanh. ");
            System.out.println("2. Chuyen xe ngoai thanh. ");
            System.out.println("0. Thoat.");
            chon = sc.nextInt();
            switch(chon){
                case 1:{
                    ChuyenXeNoiThanh xenoi = new ChuyenXeNoiThanh();
                    xenoi.nhap();
                    listChuyenXe.add(xenoi);
                    sum1 += xenoi.getDoanhThu();
                }
                    break;
                
                case 2:{
                    ChuyenXeNgoaiThanh xengoai = new ChuyenXeNgoaiThanh();
                    xengoai.nhap();
                    listChuyenXe.add(xengoai);
                    sum2 += xengoai.getDoanhThu();
                }
                    break;
                    
                default:
                    break;
            }
        }
    }
    
    public void xuat(){
        for(ChuyenXe cx : listChuyenXe){
            System.out.println(cx.toString());
        }
        System.out.println("-----------------------------------");
        System.out.println("Doanh thu chuyen xe noi thanh: "+ sum1);
        System.out.println("Doanh thu chuyen xe ngoai thanh: "+ sum2);

    }
    
}
