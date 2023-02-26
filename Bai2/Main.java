/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;
import java.util.Scanner;
/**
 *
 * @author sang
 */
public class Main {
    public static void main(String[] args) {
        LibraryCard LB = new LibraryCard(100,"Loc",11);
        System.out.println("LibraryCard: {"+LB.toString()+"}");
        
        Book B = new Book("One", "Food", "Loc" );
        System.out.println("Book: {"+B.toString()+"}");
        
        Student ST = new Student("1","Loc","CNTT2");
        System.out.println("Student: {" + ST.toString() + "}");
    }
}
