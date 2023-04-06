/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Lab7;

/**
 *
 * @author sang
 */
public class MoveableCircle implements Moveable {

    public MoveablePoint center;
    public int radius;

    public MoveableCircle(MoveablePoint point, int radius) {
        this.center = point;
        this.radius = radius;
    }

    

    

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;        
    }

    @Override
    public String toString() {
        return "MoveableCircle{" + "center=" + center + ", radius=" + radius + '}';
    }
    
    
}