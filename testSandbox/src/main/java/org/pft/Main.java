package org.pft;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    @Parameter(names = "-ptrn", description = "Паттерн поиска")
    public String ptrn;

    @Parameter(names = "-strs", description = "Строки для поиска, разделенные символом |")
    public String strs;

    public void run(){
        List<String> strings = Arrays.asList(strs.split("[|]"));
        for(String s: strings)
            System.out.println(s + " " + regTest(ptrn,s));
    }

    public static void main(String[] args){
        Main main = new Main();
        JCommander jCommander = new JCommander(main);
        try {
            jCommander.parse(args);
        }catch (ParameterException ex){
            jCommander.usage();
            return;
        }
        main.run();
//        char c1, c2;
//        String str = "ffuel";
//        c1 = str.charAt(0);
//        c2 = str.charAt(1);
//        System.out.println(c1 == c2);
//        System.out.println(c1 == c2);

//        String[] langs = {"java", "C#", "Delphi"};
//        for(String l: langs){
//            System.out.println(l);
//        }
//        List<String>  strings = Arrays.asList("tro.com", "tro@com", "123.org", ".ruru");
//        for(String s: strings)
//            System.out.println(s + " " + regTest(".+\\.(com|ru|org)", s));
//        //strings.stream().filter((s) -> !s.equals("")).map()
//        File f = new File("");
    }

    public boolean regTest(String ptrn, String str){
        Pattern p = Pattern.compile(ptrn);
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
