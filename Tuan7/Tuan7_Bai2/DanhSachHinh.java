/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Bai2;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author sang
 */
public class DanhSachHinh{
    ArrayList<Hinh> list;
    int chon;
    Hinh h;
    Scanner sc;

    public DanhSachHinh() {
        super();
        list = new ArrayList<Hinh>();
        sc =new Scanner(System.in);
    }
    
    public void Them(int n){
        for(int i = 0; i<n; i++){
            System.out.println("1. Hinh tron.");
            System.out.println("2. Hinh chu nhat.");
            System.out.println("0. Thoat.");
            chon = sc.nextInt();
            switch(chon){
                case 1:{
                    HinhTron ht = new HinhTron();
                    ht.nhapHinhTron();
                    list.add(ht);
                }
                    break;
                case 2:{
                    HinhChuNhat hcn = new HinhChuNhat();
                    hcn.nhapHinhChuNhat();
                    list.add(hcn);
                }
                    break;
                default:
                    break;
            }
        }
    }
    
    public void InDanhSach(){
        for(Hinh h : list){
            System.out.println(h.toString());
        }
    }
    
    
    
    
}
