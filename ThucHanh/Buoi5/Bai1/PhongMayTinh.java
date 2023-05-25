/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author sang
 */
public class PhongMayTinh extends PhongHoc{
    private int mayTinh;

    public PhongMayTinh() {
        super();
    }

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen,int mayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.mayTinh = mayTinh;
    }
    
    @Override
    public boolean datChuan(){
        if(super.datChuan() && (dienTich / mayTinh >= 1.5))
            return true;
        else
            return false;
    }

    public int getMayTinh() {
        return mayTinh;
    }

    public void setMayTinh(int mayTinh) {
        this.mayTinh = mayTinh;
    }

//    @Override
//    public String toString() {
//        return "PhongMayTinh{" +super.toString()+ "mayTinh=" + mayTinh + '}';
//    }
//    
    
    
}
