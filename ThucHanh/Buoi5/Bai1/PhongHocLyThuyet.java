/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author sang
 */
public class PhongHocLyThuyet extends PhongHoc{
    private boolean mayChieu;

    public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen,boolean mayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.mayChieu = mayChieu;
    }

    @Override
    public boolean datChuan(){
        if(mayChieu == true && super.datChuan()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }

//    @Override
//    public String toString() {
//        return "PhongHocLyThuyet{"+super.toString() + "mayChieu=".formatted(mayChieu) + '}';
//    }
//    
    
    
}
