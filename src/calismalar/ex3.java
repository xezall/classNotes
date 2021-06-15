package calismalar;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
            //Write a Java program that takes a number as input and prints its multiplication table upto 10.
            Scanner in = new Scanner(System.in);
            System.out.println("Please, Input a number : ");
            int n1 = in.nextInt();

            for (int i = 0; i <= 10; i++) {
                System.out.println(n1 + " x " + i + " = " + (n1 * i));
            }
        }


}
