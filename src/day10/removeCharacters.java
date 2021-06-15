package day10;
import java.util.Scanner;
public class removeCharacters {
    //Task : Create a java program that will check given string and
    //    if string starts or ends with 'a' or 'A' remove it from string.
    //    if it is not leave it as it is :
    //    examples :
    //    if string is Hello  output should be Hello
    //    if string is JavA  output should be jav
    //    if string is Ajavaa  output should be jav
    //    .....
    //    Hint : Try with different cases to make sure your code is working correctly .
    //    if you want to try with multiple words to you can create scanner and try multiple times with different words
    public static void main(String[] args) {
        //example Java
        //lentgh
        //length will change if you remove somethigng inside
        //first letter and last letter
        //Aka
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Word : ");
        String word=scan.next();//Aka
        int lenght=word.length(); // 3
        System.out.println("before modification length of word :"+lenght); //3
        //first check first letter
        //if letter small or capital a remove it
        if (word.substring(0,1).equalsIgnoreCase("a")){
            //this will check first letter if it is a or A it will check it
            word = word.substring(1); // word = ka
            System.out.println("Word first case : " + word); // ka
        }
        //last letter
        //to check last letter you need to have index number
        //last char index will be always length -1
        lenght = word.length(); // need to reassigned because if first if works length of word will change // 2
        System.out.println("After first letter length is :" +lenght);//2
        //to get last index number of word
        int lastIndex=lenght-1; //last character //1
        if (word.substring(lastIndex).equalsIgnoreCase("A")){
            //word.substring(lastIndex) you only catch last index letter
            word = word.substring(0,lastIndex); // last index wont be included // word = k
        }
        System.out.println("Modified word : " + word);
    }
}