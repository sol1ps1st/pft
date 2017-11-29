package org.pft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        char c1, c2;
        String str = "ffuel";
        c1 = str.charAt(0);
        c2 = str.charAt(1);
        System.out.println(c1 == c2);
        System.out.println(c1 == c2);

        String[] langs = {"java", "C#", "Delphi"};
        for(String l: langs){
            System.out.println(l);
        }
        List<String> list =  Arrays.asList("123","3");
        List<String> list1 =  Arrays.asList(langs);
        //ArrayList<int> d = new ArrayList<int>();
    }
}
