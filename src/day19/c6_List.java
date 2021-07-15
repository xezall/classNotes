package day19;

import java.util.ArrayList;
import java.util.Arrays;

public class c6_List {
    public static void main(String[] args) {
        ArrayList  list= new ArrayList<>();
        list.add(2);
        list.add("sayi");
        System.out.println(list);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(5);
        list2.add(3);
        list2.add(7);
        list2.add(1);
        System.out.println(list2);
        list2.addAll(Arrays.asList(5,5,7,9,1));
        System.out.println("list2 = " + list2);
        System.out.println(list2.get(3));
        System.out.println("list2.size() = " + list2.size());
        int min=Integer.MIN_VALUE;
        System.out.println(min);
        double max=Double.MAX_VALUE;
        System.out.println(max);
    }
}
