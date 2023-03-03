/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        Cylinder C1 = new Cylinder(2.5, 2, "red");
        System.out.println("Radius = " + C1.getRadius() + 
                            " Height = " + C1.getHeight() + 
                            " Color = " + C1.getColor() + 
                            " Area = " + C1.getArea() + 
                            " Volume = " + C1.getVolume());
    }
}
