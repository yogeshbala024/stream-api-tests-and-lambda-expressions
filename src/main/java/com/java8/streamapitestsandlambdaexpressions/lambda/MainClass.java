package com.java8.streamapitestsandlambdaexpressions.lambda;

public class MainClass {

    public static void main(String[] args){

        Printable methodLambda = () -> System.out.println("WROOM ");
        printableMethod(methodLambda);
    }

    static void printableMethod(Printable obj){
        obj.print();
    }
}
