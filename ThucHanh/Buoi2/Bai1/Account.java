/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class Account {
    private long soTK;
    private double soTienTK;
    private String tenTK;
    
    public final static double laiSuat = 0.035;

    
    Scanner sc = new Scanner(System.in);


    public Account(long soTK, double soTien, String tenTK) {
        this.soTK = soTK;
        this.soTienTK = soTien;
        this.tenTK = tenTK;
    }
    
    public Account(long soTK){
        this.soTK = soTK;
        this.tenTK = "Chua xac dinh";
        this.soTienTK= 50.0;
                
    }

    public Account() {
        this(999999, 50.0, "Chua xac dinh");
            
    }
    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        if(soTK > 0 && soTK != 999999){
            this.soTK = soTK;
        }else{
            this.soTK = 999999;
        }
    }

    public double getSoTien() {
        return soTienTK;
    }

    public void setSoTien(double soTien) {
        if(soTien >= 50){
            this.soTienTK = soTien;
            
        }else{
            System.out.println("So tien khong hop le");
            this.soTienTK=50.0;
        }
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        if(!tenTK.equals("")){
            this.tenTK = tenTK;
        }else{
            System.out.println("Tai khoan khong hop le");
            this.tenTK = "Chua xac dinh";
        }
    }
    
    
    
    public boolean napTien(double sotien){
        if(sotien < 0){
            System.out.println("So tien nap khong hop le!");return false;
        }
        
        this.soTienTK = sotien + soTienTK;
//        System.out.println("Nap Thanh Cong");
        return true;
         
    }
    
    public boolean rutTien(double sotien){
        if(sotien < 0 || sotien > this.soTienTK - 50){
            System.out.println("So tien rut khong hop le"); return false;
        }
        this.soTienTK -= sotien;
//        System.out.println("Rut Thanh Cong");
        return true;
    }
    
    public static boolean chuyenTien(Account gui, Account nhan, double sotien){
        
        if(gui.getSoTien() < sotien )
            return false;
        gui.rutTien(sotien);
        nhan.napTien(sotien);
        
        return true;
        
    }

}
