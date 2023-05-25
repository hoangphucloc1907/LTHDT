/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyPhongHoc qlph = new QuanLyPhongHoc();
        qlph.themPhongHoc(new PhongHocLyThuyet("LT01", "A", 100, 10, true));
        qlph.themPhongHoc(new PhongHocLyThuyet("LT02", "A", 50, 6, true));

        qlph.themPhongHoc(new PhongMayTinh("MT01", "B", 150, 8, 50));
        qlph.themPhongHoc(new PhongMayTinh("MT02", "B", 80, 3, 30));

        qlph.themPhongHoc(new PhongThiNghiem("TN01", "C", 100, 5, "CNTT", 30, true));
        qlph.themPhongHoc(new PhongThiNghiem("TN02", "C", 120, 5, "CNTT", 20, true));

        int choose;
        do {
            System.out.println("1. In Phong Hoc");
            System.out.println("2. Tim Phong Hoc");
            System.out.println("3. Sap Xep Tang Dan Theo Day Nha");
            System.out.println("4. Sap Xep Giam Dan Theo Dien Tich");
            System.out.println("5. Sap Xep Tang Dan Theo Bong Den.");
            System.out.println("6. Phong Dat Chuan");
            System.out.println("7. Xoa Phong Hoc");
            System.out.println("8. In Tong So Phong");
            System.out.println("9. Thoat");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                    qlph.inDanhSach();
                    break;
                }
                case 2: {
                    System.out.println("Nhap Ma Phong Can Tim");
                    PhongHoc ph = qlph.timPhongHoc(sc.nextLine());
                    if (ph != null) {
                        System.out.println("Tim thay phong hoc");
                    } else {
                        System.out.println("Khong tim thay phong hoc");
                    }
                    break;
                }

                case 3: {
                    qlph.tangDanTheoDayNha();
                    System.out.println("Danh Sach Sau Khi Sap Xep");
                    qlph.inDanhSach();
                    break;
                }

                case 4: {
                    qlph.giamDanTheoDienTich();
                    System.out.println("Danh Sach Sau Khi Sap Xep");
                    qlph.inDanhSach();
                    break;
                }

                case 5: {
                    qlph.tangDanTheoBongDen();
                    System.out.println("Danh Sach Sau Khi Sap Xep");
                    qlph.inDanhSach();
                    break;
                }

                case 6: {
                    List<PhongHoc> listDatChuan = qlph.phongDatChuan();
                    for(PhongHoc ph : listDatChuan){
                        System.out.println("Phong Dat Chuan: " + ph.getMaPhong());
                    }
                    break;

                }

                case 7: {
                    System.out.println("Nhap Ma Phong Can Xoa: ");
                    qlph.xoaPhongHoc(sc.next());
                    break;
                }
                case 8: {
                    qlph.inTongSoPhong();
                    break;
                }
                default:
                    break;

            }
        } while (choose != 9);
    }

}
