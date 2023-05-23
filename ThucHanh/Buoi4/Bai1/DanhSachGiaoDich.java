/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class DanhSachGiaoDich {
    ArrayList<GiaoDich> listGD;
    Scanner sc = new Scanner(System.in);
    public DanhSachGiaoDich(){
        listGD = new ArrayList<>();
    }
    int count1 = 0, count2=0;
    double sum;
    public void input(){
        int choose;
        do{
            System.out.println("1. Giao Dich Nha.");
            System.out.println("2. Giao Dich Dat.");
            System.out.println("3. Thoat.");
            choose = sc.nextInt();
            switch(choose){
                case 1:{
                    GiaoDichNha gdn = new GiaoDichNha();
                    gdn.Nhap();
                    listGD.add(gdn);
                    count1++;
                }
                    break;
                case 2:{
                    GiaoDichDat gdd = new GiaoDichDat();
                    gdd.Nhap();
                    listGD.add(gdd);
                    sum += gdd.ThanhTien();
                    count2++;
                }
                    break;
                default:
                    break;
            }
        }while (choose != 3);
    }
    
    public void output(){
        for(GiaoDich gd : listGD){
            System.out.println(gd.toString());
        }
    }
    public void TongSoLuong(){
        System.out.println("Tong So Luong Giao Dich Nha: "+ count1);
        System.out.println("Tong So Luong Giao Dich Nha: "+ count2);
    }
    public void TrungBinhGDD(){
        DecimalFormat f = new DecimalFormat("###,###");
        System.out.println("Trung binh thanh tien giao dich dat: " + f.format((sum/count2)));
    }
}
