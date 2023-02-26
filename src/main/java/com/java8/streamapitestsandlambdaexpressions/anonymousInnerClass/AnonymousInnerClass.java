package com.java8.streamapitestsandlambdaexpressions.anonymousInnerClass;

import com.java8.streamapitestsandlambdaexpressions.lambda.Animal;
import com.java8.streamapitestsandlambdaexpressions.lambda.Printable;

public class AnonymousInnerClass {
    public static void main(String[] args){
        //here we are gonna create an anonymous inner class where the object instance of the new class can be created only once

        //lets use the class Animal from the package lambda
        Animal animal = new Animal();
        animal.print();

        //if we want to create a new animal say a dog which extends the animal class and can be used only once then we use anonymous inner class
        Animal dog = new Animal(){
            public void print(){
            System.out.println("Woof Woof");
            }
            };
        dog.print();

        //another way of creating is through interfaces
        Printable print = new Printable() {
            @Override
            public void print() {
                System.out.println("Object");
            }
        };
    }
}
