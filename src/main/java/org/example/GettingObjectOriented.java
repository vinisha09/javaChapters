package org.example;

import java.util.GregorianCalendar;

public class GettingObjectOriented {
    public static void main(String[] args) {
        Person john = new Person("john","Doe",new GregorianCalendar(1988,1,5));


        System.out.println("Hello my name is " +
                john.fullName() +
                ". I am " +
                john.age(new GregorianCalendar()) +
                " years old.");
    }
}
