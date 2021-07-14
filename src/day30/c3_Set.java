package day30;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class c3_Set {
    public static void main(String[] args) {
        Set<String> letters=new HashSet<>();
        letters.add("a");
        letters.add("a");
        letters.add("d");
        letters.add("e");
        System.out.println(letters);

        Set<String> letters2=new LinkedHashSet<>();
        letters2.add("a");
        letters2.add("a");
        letters2.add("d");
        letters2.add("c");
        letters2.add("e");

        System.out.println(letters2);

        Set<String> letters3=new TreeSet<>();
        letters3.add("a");
        letters3.add("a");
        letters3.add("d");
        letters3.add("c");
        letters3.add("e");
        letters3.add(null);
        System.out.println(letters3);


    }
}
