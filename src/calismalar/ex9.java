package calismalar;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        //1. write a program that ask user to enter sentence.
         //       Then print out the first and last characters
        //2. Ask user to enter a word. Print true if the first and last characters of the string are same characters, print false otherwise.
          //      Input:
        //abba
       // Output:
        //true
        Scanner sentence=new Scanner(System.in);
        System.out.println("Please write a sentence which you love more than everything: ");
        String str=sentence.nextLine();
        char firstCharacter=str.charAt(0);
        System.out.println(firstCharacter);
        System.out.println(str.length());
        char lastCharacter=str.charAt(22);
        System.out.println(lastCharacter);


    }
}
