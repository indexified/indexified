package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println(Arrays.asList(setPhNo("23")));

        String in = "904";

        for (int i = 0; i < in.length() ; i++) {
             int a = Integer.parseInt(String.valueOf(in.charAt(i)));
            //System.out.println(Arrays.asList(setPhNo(a)));
            Arrays.stream(setPhNo(a)).iterator().forEachRemaining(s -> System.out.println(s));
        }

    }

    private static String[] setPhNo(int x) {
            Map<Integer,String[]> setValues =new HashMap<>();

            setValues.put(0, new String[]{"a", "b","c"});
            setValues.put(1, new String[]{"d", "e", "f"});
            setValues.put(2, new String[]{"g", "h", "i"});
            setValues.put(3, new String[]{"j", "k", "l"});
            setValues.put(4, new String[]{"m", "n", "o"});
            setValues.put(5, new String[]{"p", "q", "r"});
            setValues.put(6, new String[]{"s", "t", "u"});
            setValues.put(7, new String[]{"v", "x", "y"});
            setValues.put(8, new String[]{"z", "1", "2"});
            setValues.put(9, new String[]{"3", "4", "5"});

            return setValues.get(x);

    }



}
