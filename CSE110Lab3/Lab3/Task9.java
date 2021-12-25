/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse110.lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Task9 {
     public static void main(String[]args){      
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st number:");
            float i=sc.nextFloat();
           
            if(i%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
    
}
}
