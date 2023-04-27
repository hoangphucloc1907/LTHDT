/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1A;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class DanhSachXe {

    ArrayList<Vehicle> listXe;
    Scanner sc = new Scanner(System.in);

    int chon;

    public DanhSachXe() {
        super();
        listXe = new ArrayList();
    }

    public void menu() {
        do {
            System.out.println("1. Nhap Thong Tin Xe.");
            System.out.println("2. Xuat Thong Tin");
            System.out.println("3. Thoat");
            System.out.println("Chon Chuc Nang:");

            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    Vehicle xe = new Vehicle();
                    xe.nhap();
                    listXe.add(xe);
                }
                break;
                
                case 2: {
//                    System.out.print("Ten Chu Xe \t");
//                    System.out.print("\t\tLoai Xe");
//                    System.out.print("\t\t\tDung Tich");
//                    System.out.print("\t\tGia Xe");
//                    System.out.print("\t\t\t\tThue Phai Nop\n");
                    System.out.format("%-30s %-30s %30s %30s %30s \n",
                            "Ten Chu Xe",
                            "Loai Xe",
                            "Dung Tich",
                            "Gia Xe",
                            "Thue Phai Nop");
                    System.out.println("====================================================================================================================================================================================");
                    for (Vehicle vh : listXe) {
                        System.out.format("%-30s %-30s %30s %30.2f %30.2f \n",
                                vh.getTenChuXe(),
                                vh.getLoaiXe(),
                                vh.getDungTich(),
                                vh.getGiaXe(),
                                vh.getThueMuaXe());

                    }
                }
                break;

                default:
                    break;
            }
        } while (chon != 3);

    }
}
