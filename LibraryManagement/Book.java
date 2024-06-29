/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author adalatadiljan
 */
public class Book {
    /* Every instance of the class creates a unique book: Since it's unique,
    the attributes will be declared as private */
    
    private String title; 
    private int isbn; 
    private String author; 
    private boolean isBorrowed; // To know if the book is borrowed. 
    
    public Book(){
    this.title = title; 
    this.isbn = isbn; 
    this.author = author; 
    this.isBorrowed = false; 
    
    }
    public String getTitle(){
        return title;
    }
    public int getisbn(){
        return isbn; 
    }
    public String getAuthor(){
        return author;
    }
    public boolean getBorrowed(){
        return isBorrowed;
    }
    public void borrowBook(){
        isBorrowed = true;
    }
    public void returnedBook(){
        isBorrowed = false;
    }
       
}
