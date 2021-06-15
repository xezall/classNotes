package calismalar;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        //Question 7
        //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
       int result1=0;
       int result2=0;
        for( int i=1; i<5; i++){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter integer number : ");
            int ai=input.nextInt();

            if(ai%2==0){
                result1 +=ai;

            }else{
                result2 += ai;

            }

        }
        System.out.println("The sum of even numbers are : " +result1);
        System.out.println("The sum of odd numbers are : "+result2);

    }
}
