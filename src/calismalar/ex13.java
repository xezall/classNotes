package calismalar;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        /*
    Task :
    Write a Java program to display the middle character of a string in uppercase
        --> If the length of the string is even number  String will have two middle characters.
        --> If the length of the string is odd number String  will have one middle character.
    example :
                Input 1 :  World             Output 1:Middle character is: R
                Input 2 :  computer          Output 2:Middle character is: PU
                .....
    Task : Create a java program that will check given string and if string starts or ends with 'a' or 'A' remove it from string.
    if it is not leave it as it is :
    examples :
    if string is Hello  output should be Hello
    if string is JavA  output should be jav
    if string is Ajava  output should be jav
    .....
    Hint : Try with different cases to make sure your code is working correctly .
    if you want to try with multiple words to you can create scanner and try multiple times with different words
 */
        Scanner input1=new Scanner(System.in);
        System.out.println("Please, write your first word : ");
        String str1=input1.next();
        int middle1=str1.trim().length();
        if (middle1%2 == 0){
            System.out.println(str1.substring( (middle1/2-1 ) ,(middle1/2+1) ).toUpperCase());
        }else {
            System.out.println(str1.substring( (middle1/2 ) ,(middle1/2+1) ).toUpperCase());
        }
    }
}
