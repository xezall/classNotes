package day30;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class c2_Quee {
    public static void main(String[] args) {
        Queue<Integer> numbers=new PriorityQueue<>();//sorting
        numbers.add(2);
        numbers.add(200);
        numbers.add(5);
        numbers.add(15);
        System.out.println(numbers);

        Integer number=numbers.poll();
        System.out.println(number);

        System.out.println(numbers);
        Queue<Integer> numbers2=new ArrayDeque<>();
        numbers2.add(2);
        numbers2.add(200);
        numbers2.add(5);
        numbers2.add(15);
        System.out.println(numbers2);
        Integer number2=numbers2.poll();
        System.out.println(number2);
        System.out.println(numbers2);

    }

}
