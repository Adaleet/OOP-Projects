/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.library;

/**
 *
 * @author adalatadiljan
 */
public class Library {

    public static void main(String[] args) {
        System.out.println("Hello World!" );
        Library mini = new Library(); 
        
        int sum = mini.addValues(2,2);
        System.out.println(sum);
    }
    
    public String getGreeting(String name){
       return "Hello," + name + "!"; 
    }
    public int addValues(int a, int b){
      return a+b; 
    }
    }
