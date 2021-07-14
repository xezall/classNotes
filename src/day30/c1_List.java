package day30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class c1_List {
    public static void main(String[] args) {
        List<Integer> numberList= new ArrayList<>();
        numberList.add(25);
        numberList.add(25);

        ArrayList<String> words=new ArrayList<>();
        words.add("Hello");
        words.add("Hello");
        words.add(null);


        List<Integer> list2=new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(5);


        List<Integer> list3=new Vector<>();
        list3.add(20);
        list3.add(40);
        list3.remove(0);



    }

}
