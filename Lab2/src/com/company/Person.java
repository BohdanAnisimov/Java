package com.company;
import java.io.Serializable;

public class Person implements Serializable{
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
