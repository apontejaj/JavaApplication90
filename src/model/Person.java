/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author apont
 */
public class Person {
    
    private String name;
    private int age;
    private ArrayList<String> languages;
    private String nationality;
    
    public Person(String name){
        this.name = name;
        this.languages = new ArrayList<String>();
        System.out.println(this.name + " has born.");
    }
    
    public void walk(){
        System.out.println(this.name + " is walking.");
    }
    
    public void run(){
        System.out.println(this.name + " is running.");
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name, String password){
        if(password.equals("mysecretpassword")){
            this.name = name;
        }
        else{
            System.out.println("Sorry, pal! Incorrect password");
        }
        
    }
    
    public ArrayList<String> getLanguages(){
        return this.languages;
    }
    
    public void addNewLanguague(String newLanguage){
        this.languages.add(newLanguage);
    }
    
    
    
}
