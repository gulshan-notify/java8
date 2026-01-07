package com.example.Java8.Controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {

     public static void main(String[] args) {

          List<Integer> list =Arrays.asList(1,2,3,34,34,3,4,5,23,2,342,235,555);

          List<Integer>list1= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
          List<Integer>list2= list.stream().map(String::valueOf).filter(x-> x.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
          int no= list.stream().reduce(10,(a,b)-> a+b);
          Integer max=list.stream().mapToInt(Integer::intValue).max().getAsInt();

          String str="Welcome To India";
         List<Character> list3= str.replace(" ","").chars().mapToObj(x-> Character.toLowerCase(Character.valueOf((char)x))).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                  entrySet().stream().filter(a-> a.getValue()>1).map(b-> b.getKey()).collect(Collectors.toList());


          System.out.println("Result: "+list3);
     }

}
