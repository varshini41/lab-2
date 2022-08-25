/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentgrade;
import java.util.Scanner;

/**
 *
 * @author ajee
 */
public class Studentgrade {
    int evs;
    int mat;
    int phy;
    int java;
    int dpsd;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Studentgrade sc=new Studentgrade();
        sc.getdata();
        sc.calculate();
    }
    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student marks");
        evs=sc.nextInt();
        mat=sc.nextInt();
        phy=sc.nextInt();
        java=sc.nextInt();
        dpsd=sc.nextInt();
    }
    public void calculate(){
        float total;
        float avg;
        char grade;
        total=evs+mat+phy+java+dpsd;
        avg=total/5;
        if(avg>=91)
            System.out.println("Grade 0");
        else if(avg>=81&&avg<=90)
            System.out.println("Grade A+");
        else if(avg>=71&&avg<=80)
            System.out.println("Grade A");
        else if(avg>=61&&avg<=70)
            System.out.println("Grade B+");
        else if(avg>=50&&avg<=60)
            System.out.println("Grade B");
        else
           System.out.println("RA"); 
    }
    
}