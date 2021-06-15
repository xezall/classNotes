package calismalar;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        //Question 1
        //Write a program to print numbers from 1 to 10.
        String numbers="";
        for(int i=1 ; i<=10; i++){
            numbers +=i+ " , ";
        }
        System.out.println("consecutive numbers are :" + numbers);
        //Question 2
        //Write a program to calculate the sum of first 10 natural number.
        int sumnumber=0;
        for(int i=0;i<=10; i++){
            sumnumber += i;
        }
        System.out.println("sumnumber of natural numbers between 0 and 10 is : " + sumnumber);

        //Question 3
        //Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.
        Scanner input=new Scanner(System.in);
        System.out.println("Please give a integer number : " );
        int a=input.nextInt();
        int multiplication=1;

        for (int i=0; i<=10 ; i++ ){
            multiplication =i*a;
            System.out.println("the multiplication table is : " + multiplication);
        }

        //Question 4
        //Write a program to find the factorial value of any number entered through the keyboard.
        int factorial=1;
        for (int i=1; i<=a ; i++ ){
            factorial *=i;
        }
        System.out.println("the factorial value is : " +factorial);


    }
}
