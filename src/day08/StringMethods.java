package day08;
import java.lang.String;// no need to import beacuse java will import automatiicaly anything starts with java.lang
public class StringMethods {
    /*
Method               Description                                                      Return Type
charAt()             Returns the character at the specified index (position)          char
concat()             Appends a string to the end of another string                        String
contains()           Checks whether a string contains a sequence of characters            boolean
endsWith()           Checks whether a string ends with the specified character(s)     boolean
equals()             Compares two strings. Returns true if the strings are equal,
                      and false if not                                                 boolean
equalsIgnoreCase()   Compares two strings, ignoring case considerations               boolean
indexOf()            Returns the position of the first found occurrence
                      of specified characters in a string                              int
isEmpty()            Checks whether a string is empty or not                          boolean
lastIndexOf()        Returns the position of the last found occurrence of
                      specified characters in a string                                 int
length()             Returns the length of a specified string                         int
replace()            Searches a string for a specified value, and returns
                      a new string where the specified values are replaced             String
replaceFirst()       Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement              String
startsWith()         Checks whether a string starts with specified characters         boolean
substring()              Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character                        String
toLowerCase()        Converts a string to lower case letters                          String
toUpperCase()        Converts a string to upper case letters                          String
trim()               Removes whitespace from both ends of a string                        String
     */
    public static void main(String[] args) {
        //charAt()            Returns the character at the specified index (position)          char
        String str= "Hello";
        //01234
        //index numbers starts from 0 in java
        char ch=str.charAt(0); //H
        System.out.println(ch);
        System.out.println(str.charAt(2)); // l
        //charAt method will ask for number
        //char ch2=str.charAt(5);
        //System.out.println(ch2); String index out of range: 5
        // StringIndexOutOfBoundsException because string range is 0-4
        // dataType nameofObject = value
        // int        heshu= 15
        // string    rami = "ssssss "
        // char     char1= 's';
        String word="Hello world";
        //012345678910
        System.out.println(word.charAt(5)); // charAT method will ask indexx number
        //concat()           Appends a string to the end of another string                        String
        String firstName="Ramazan";
        String lastName="Ozer";
        System.out.println(firstName+lastName);
        System.out.println(firstName.concat(lastName)); //concat method will ask what to concat with firstName
        String fullName=firstName.concat(lastName);
        //full name will be RamazanOzer
        System.out.println(fullName);
        //firstName = firstName.concat(lastName);
        //fristname= ramazan.concat(ozer)
        //first name will be RamazanOzer
        System.out.println(firstName.concat(" ozer")); //RamazanOzer ozer
        String myStr="Feyzeddin";
        String myStr2="Donmez";
        int score=90;
        System.out.println("*****************************************");
        System.out.println(myStr.concat(" " + myStr2));
        System.out.println(myStr.concat(" ").concat(myStr2));
        System.out.println(myStr.concat(" ").concat(myStr2).concat(" his score is: ").concat(""+score));
        System.out.println(myStr.charAt(3));//Feyzeddin
        //0123        z
        System.out.println(myStr.concat(myStr2).charAt(12)); //FeyzeddinDonmez
        //0123456789101112    m
        //contains()             Checks whether a string contains a sequence of characters            boolean
        System.out.println("*********************");
        //contains method will check if string contains given value
        // if it contains it will return true
        // if it is not then it will be false
        String ss1="Java  n  Ja5435";
        System.out.println(ss1.contains("j"));  //small case j which we dont have inside ss1 false
        System.out.println(ss1.contains("a")); //true
        System.out.println(ss1.contains("Ja")); //true
        System.out.println(ss1.contains("Ja "));//no space inside of ss1 it will false
        System.out.println("***************");
        System.out.println(ss1.contains("J"));  //true
        System.out.println(ss1.contains("va")); //true
        System.out.println(ss1.contains("Jv")); //Jv will be new string and we dont se Jv together inside ss1 false
        boolean example=ss1.contains(" ");
        System.out.println(example);
        // endsWith()       Checks whether a string ends with the specified character(s)       boolean
        // if your string ends with given condition it will be true
        // if it is not then you will have false
        System.out.println("****************");
        String ss2="Java 23 Hello";
        System.out.println(ss2.endsWith("Java")); // at the end we dont have Java False
        System.out.println(ss2.endsWith("o"));
        System.out.println(ss2.endsWith("lo"));
        System.out.println(ss2.endsWith("hello")); // samll h will be false
        System.out.println(ss2.endsWith("23 Hello"));
        System.out.println(ss2.endsWith("Java 23 Hello"));
    }
}