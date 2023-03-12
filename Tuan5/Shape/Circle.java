/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author sang
 */
public class Circle extends Shape{
    private double radius;
    private float PI =(float) 3.14;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return PI * radius * radius;
    }
    
    public double getPerimeter(){
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", PI=" + PI + '}';
    }
    
    
}
