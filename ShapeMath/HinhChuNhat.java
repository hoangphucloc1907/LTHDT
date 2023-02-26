/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeMath;

/**
 *
 * @author sang
 */
public class HinhChuNhat {
    private float length;
    private float width;

    public HinhChuNhat() {
        this.length=0;
        this.width=0;
    }

    public HinhChuNhat(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public HinhChuNhat(HinhChuNhat hcn){
        length = hcn.length;
        width = hcn.width;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    public float DienTich(){
        return this.length * this.width;
    }
    @Override
    public String toString(){
        return "Chieu dai: "+ this.length + "\nChieu rong: "+this.width + "\nDien tich: " + this.DienTich();
    }
}
