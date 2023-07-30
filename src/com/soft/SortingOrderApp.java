package com.soft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOrderApp {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,7,1,9,15,82,68,44);
        list.stream().filter(e-> e%2==0).
                forEach(System.out::println);

          list.stream().sorted().forEach(System.out::println);
        System.out.println("reverse order");
          list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);



    }
}
