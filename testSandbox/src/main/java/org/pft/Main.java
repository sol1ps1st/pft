package org.pft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        char c1, c2;
//        String str = "ffuel";
//        c1 = str.charAt(0);
//        c2 = str.charAt(1);
//        System.out.println(c1 == c2);
//        System.out.println(c1 == c2);

//        String[] langs = {"java", "C#", "Delphi"};
//        for(String l: langs){
//            System.out.println(l);
//        }
        List<String>  strings = Arrays.asList("tro.com", "tro@com", "123.org", ".ruru");
        for(String s: strings)
            System.out.println(s + " " + regTest(".+\\.(com|ru|org)", s));
        //strings.stream().filter((s) -> !s.equals("")).map()
    }

    public static boolean regTest(String ptrn, String str){
        Pattern p = Pattern.compile(ptrn);
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
