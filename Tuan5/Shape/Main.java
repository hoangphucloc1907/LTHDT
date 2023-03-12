/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        Square S = new Square(5);
        
        S.getArea();
        System.out.println(S.getArea());
        
        
        Rectangle R = new Rectangle(4, 5);
        System.out.println(R.getArea());
        System.out.println("Chu vi la: "+R.getPerimeter());
        
        Circle C = new Circle(3);
        C.getArea();
        System.out.println(C.getArea());
    }
    
}
