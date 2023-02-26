/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        Vector a = new Vector(1,2,3);
        Vector b = new Vector(1,2,1);
        a.add(b);
        System.out.println(a.getX() + a.getY() + a.getZ() );
        
    }
}
