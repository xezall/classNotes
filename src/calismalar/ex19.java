package calismalar;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        //Question 8
        //Write a program that prompts the user to input a positive integer.
        // It should then output a message indicating whether the number is a prime number.
        Scanner input=new Scanner(System.in);
        System.out.println("Please write a positive integer number : ");
        int number=input.nextInt();
        String result1 ="";
        String result2 ="";

        for(int i=2;i<=number-1;i++){
           if (number%i!=0 ){
               result1 = ""+number;
           }
           else{
               result2 =""+number;
           }
        }
        System.out.println(result1 + " is prime number .");
        System.out.println(result2 + "is not prime number .");
    }
}
