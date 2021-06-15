package calismalar;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //Write a Java program to compare two numbers.
        Scanner in=new Scanner(System.in);
        System.out.println("Input first integer number : " );
        int x= in.nextInt();
        Scanner in1=new Scanner(System.in);
        System.out.println("Input first integer number : " );
        int y= in.nextInt();
        if (x<y){
            System.out.println(x + " is smaller than " + y);
        }else if(x==y){
            System.out.println(x + " is equal to " + y);
        }else{
            System.out.println(x + " is bigger than " + y);
        }

    }
}
