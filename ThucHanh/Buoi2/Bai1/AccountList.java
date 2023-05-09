/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sang
 */
public class AccountList {
    ArrayList<Account> accList;
    int count;
    

    

    public AccountList() {
        super();
        accList = new ArrayList<>();
    }
    
    public int search(long stk){
        for(Account account : accList){
            if(account.getSoTK() == stk){
               return accList.indexOf(account);
                
            }
        }
        return -1;
    }
    
    public boolean delete(long stk){
        if(search(stk) == -1)
            return false;
        accList.remove(getSTK(stk));
        return true;
    }

    
    public int size(){
        return accList.size();
    }
    
    public Account getSTK(long stk){
        if(search(stk) == -1) 
            return null;
        return accList.get(search(stk));
    }
    
    public void addAccount(){
        Account account = new Account();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so TK: ");
        account.setSoTK(sc.nextLong());sc.nextLine();
        System.out.println("Nhap ten TK: ");
        account.setTenTK(sc.nextLine());
        account.setSoTien(50);
        
        accList.add(account);

    }
    
    
    public void output(){
        System.out.format("%-20s %20s %20s \n", "So TK", "Ten TK", "So Tien");
        for(Account account : accList){
            System.out.format("%-20d %20s %20.2f \n", account.getSoTK(), account.getTenTK(), account.getSoTien());
        }

    }
}
