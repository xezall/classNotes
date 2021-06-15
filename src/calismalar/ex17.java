package calismalar;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        //Question 6
        //Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        //For example, if the input is 12345, the output should be 54321.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your integer number : ");
        String a=input.next();
        String result="";

        for(int i=a.length()-1 ;i>=0; i--){
            result +="" +a.charAt(i);
        }
        System.out.println("the digits reversed : "+result);

    }
}
