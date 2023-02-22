package com.java8.streamapitestsandlambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(new Integer[] { 5, 2, 9, 1, 21, 12, 91, 75, 26 });
        // testing stream api
        Stream<Integer> stream = list.stream();
//        long count = stream.count();
//        System.out.println(count);
//        System.out.println(stream.count());
        // streams are one consumed will close automatically thus they wont impact the memory
        Integer li  = list.stream().sorted().filter(n -> n%2==1).findFirst().map(n -> n-1).get();
        System.out.println(li);



    }
}
