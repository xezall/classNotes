package calismalar;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
       /* Task : Create a java program that will check given string and if string starts or ends with 'a' or 'A' remove it from string.
        if it is not leave it as it is :
        examples :
        if string is Hello  output should be Hello
        if string is JavA  output should be jav
        if string is Ajava  output should be jav*/
        Scanner input=new Scanner(System.in);
        System.out.println("Please, write your word  : ");
        String word=input.next();
        boolean a= word.substring(0,1).equalsIgnoreCase("a");
        boolean b= word.substring(word.length()-1).equalsIgnoreCase("a");

       if (a && b){
           System.out.println(" the new word is : " + word.substring(1,word.length()-1));

       }else if( a==true && b == false ){
           System.out.println(" the new word is : " + word.substring(1));

       }else if(a==false && b==true){
           System.out.println("the new word is : "+ word.substring(0, word.length()-1));
       }else{
           System.out.println("the new word is: " + word);
       }



    }
}
