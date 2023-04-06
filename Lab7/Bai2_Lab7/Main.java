/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Lab7;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        Moveable m1 = new MoveablePoint(3, 5, 15, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        
        Moveable m2 = new MoveableCircle(new MoveablePoint(5, 6, 10, 10), 5);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
    
}
