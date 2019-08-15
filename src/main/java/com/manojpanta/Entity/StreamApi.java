package com.manojpanta.Entity;

import java.util.Arrays;
import java.util.List;


public class StreamApi{
    public  static  void main(String[] args) {
        List<String> mylist = Arrays.asList("a1", "a2", "a3", "b1", "c1", "c2", "c3");
        mylist.stream().filter(s-> s.startsWith("c")).sorted().map(String::toUpperCase).forEach(System.out::println);
    }
}
