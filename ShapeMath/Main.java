/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeMath;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        HinhChuNhat HCN = new HinhChuNhat(5,2);
        HCN.DienTich();
        System.out.println(HCN.toString());
        
        HinhTron HT = new HinhTron (3,"Blue");
        HT.S();
        System.out.println(HT.toString());
    }
    
}
