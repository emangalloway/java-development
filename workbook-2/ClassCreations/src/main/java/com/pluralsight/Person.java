package com.pluralsight;
//Attributes
public class Person{
    private String name;
    private int age;

    //Constructor
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //Getters and Setters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
