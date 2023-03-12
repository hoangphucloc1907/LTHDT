/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaQua;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        QuaCam C = new QuaCam(10000, 10, "VietNam", "RED", 10);
        System.out.println(C.getNguongoc());
        
        CamSanh CS  = new CamSanh(20000, 1, "ThaiLan", "Blue", 12);
        System.out.println(CS.getMausac());
    }
}
