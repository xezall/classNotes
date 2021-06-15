package calismalar;

import sun.security.util.Length;

import java.sql.SQLOutput;

public class ex11 {
    public static void main(String[] args) {
      // /Task 1 : String Methods
//Sentence =hello my name is hello worlD.
// i am 25 years old.
// i am living in new yorK .
// i have been in the IT industry for about 6 years.
// i starteD as a manUal tesTer and now doing AutOMation for about 4 years.
// i have experience in different DOmains: education, Energy, finance.
// i have Scrum Master and Oracle Java Programmer certificates.
// my main lanGuage is JAVA.
// i DESigned and deveLoped many automation test scripts by using BDD framework
//first create one string and copy pass above paragraf.
//then create multiple strings to store each sentence that you see in the paragraf.
//Do below modification for your sentences :
//make sure each sentence first letter capital .
//make sure city names start with capital .
//rest needs to be small cases.
//make sure to change name,age and city information with your personal information
//make sure to trim your sentences
//after those modifications
//print each sentence length , last index number
//print first,last and fifth character from each sentence.
//
        String sentence="hello my name is hello worlD.i am 25 years old. i am living in new yorK .      \n" +
                "i have been in the IT industry for about 6 years.   \n" +
                "i starteD as a manUal tesTer and now doing AutOMation for about 4 years. \n" +
                "i DESigned and deveLoped many automation test scripts by using BDD framework";
//then create multiple strings to store each sentence that you see in the paragraf.
        String s1="hello my name is hello worlD.";
        String s2="i am 25 years old.";
        String s3="i am living in new yorK . ";
        String s4="i have been in the IT industry for about 6 years. ";
        String s5="i have experience in different DOmains: education, Energy, finance.";
        String s6="i have Scrum Master and Oracle Java Programmer certificates.";
        String s7="my main lanGuage is JAVA.";
        String s8="i starteD as a manUal tesTer and now doing AutOMation for about 4 years. ";
        String s9="i DESigned and deveLoped many automation test scripts by using BDD framework";
//Do below modification for your sentences :

//make sure each sentence first letter capital .
//        System.out.println(s1.replaceFirst("h","H"));
//        System.out.println(s2.replaceFirst("i","I"));
//        System.out.println(s3.replaceFirst("i","I"));
//        System.out.println(s4.replaceFirst("i","I"));
//        System.out.println(s5.replaceFirst("i","I"));
//        System.out.println(s6.replaceFirst("i","I"));
//        System.out.println(s7.replaceFirst("m","M"));
//        System.out.println(s8.replaceFirst("i","I"));
//        System.out.println(s9.replaceFirst("i","I"));
        //change to lowercase
        String a1=s1.toLowerCase();
        String a2=s2.toLowerCase();
        String a3=s3.toLowerCase();
        String a4=s4.toLowerCase();
        String a5=s5.toLowerCase();
        String a6=s6.toLowerCase();
        String a7=s7.toLowerCase();
        String a8=s8.toLowerCase();
        String a9=s9.toLowerCase();

        String b1=a1.trim().replaceFirst("h","H").replace("hello world", "Hello World");
        String b2=a2.trim().replaceFirst("i","I");
        String b3=a3.trim().replaceFirst("i","I").replace("new york","New York");
        String b4=a4.trim().replaceFirst("i","I").replace("it","IT");
        String b5=a5.trim().replaceFirst("i","I");
        String b6=a6.trim().replaceFirst("i","I").replace("scrum master and oracle java programmer","Scrum Master and Oracle Java Programmer");
        String b7=a7.trim().replaceFirst("m","M");
        String b8=a8.trim().replaceFirst("i","I").replace("manual tester and now doing automation","Manual Tester and now doing Automation");
        String b9=a9.trim().replaceFirst("i","I").replace("bdd framework","BDD Framework");
        // first letter capital special words are capital and trim the sentences
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);
        System.out.println(b9);

        int c1=s1.length();
        int c2=s2.length();
        int c3=s3.length();
        int c4=s4.length();
        int c5=s5.length();
        int c6=s6.length();
        int c7=s7.length();
        int c8=s8.length();
        int c9=s9.length();
        //length of sentences
        System.out.println("length of sentence : "+c1);
        System.out.println("length of sentence : "+c2);
        System.out.println("length of sentence : "+c3);
        System.out.println("length of sentence : "+c4);
        System.out.println("length of sentence : "+c5);
        System.out.println("length of sentence : "+c6);
        System.out.println("length of sentence : "+c7);
        System.out.println("length of sentence : "+c8);
        System.out.println("length of sentence : "+c9);
        //last index of sentences (original sentences)
        System.out.println("last index number of s1 :" + (c1-1));
        System.out.println("last index number of s2 :" + (c2-1));
        System.out.println("last index number of s3 :" + (c3-1));
        System.out.println("last index number of s4 :" + (c4-1));
        System.out.println("last index number of s5 :" + (c5-1));
        System.out.println("last index number of s6 :" + (c6-1));
        System.out.println("last index number of s7 :" + (c7-1));
        System.out.println("last index number of s8 :" + (c8-1));
        System.out.println("last index number of s9 :" + (c9-1));
        //first character
        System.out.println("First character of sentence is : "+b1.charAt(0));
        System.out.println("First character of sentence is : "+b2.charAt(0));
        System.out.println("First character of sentence is : "+b3.charAt(0));
        System.out.println("First character of sentence is : "+b4.charAt(0));
        System.out.println("First character of sentence is : "+b5.charAt(0));
        System.out.println("First character of sentence is : "+b6.charAt(0));
        System.out.println("First character of sentence is : "+b7.charAt(0));
        System.out.println("First character of sentence is : "+b8.charAt(0));
        System.out.println("First character of sentence is : "+b9.charAt(0));
        //fifth character
        System.out.println("Fifth character of sentence is : "+b1.charAt(4));
        System.out.println("Fifth character of sentence is : "+b2.charAt(4));
        System.out.println("Fifth character of sentence is : "+b3.charAt(4));
        System.out.println("Fifth character of sentence is : "+b4.charAt(4));
        System.out.println("Fifth character of sentence is : "+b5.charAt(4));
        System.out.println("Fifth character of sentence is : "+b6.charAt(4));
        System.out.println("Fifth character of sentence is : "+b7.charAt(4));
        System.out.println("Fifth character of sentence is : "+b8.charAt(4));
        System.out.println("Fifth character of sentence is : "+b9.charAt(4));
        //last character
        System.out.println("Last character of sentence is : "+s1.charAt(c1-1));
        System.out.println("Last character of sentence is : "+s2.charAt(c2-1));
        System.out.println("Last character of sentence is : "+s3.charAt(c3-1));
        System.out.println("Last character of sentence is : "+s4.charAt(c4-1));
        System.out.println("Last character of sentence is : "+s5.charAt(c5-1));
        System.out.println("Last character of sentence is : "+s6.charAt(c6-1));
        System.out.println("Last character of sentence is : "+s7.charAt(c7-1));
        System.out.println("Last character of sentence is : "+s8.charAt(c8-1));
        System.out.println("Last character of sentence is : "+s9.charAt(c9-1));


       // int a=s1.length()-1;
       // System.out.println(a);

       // String b=s1.charAt(0)
      // String a=s1.substring(1).toLowerCase();
//make sure city names start with capital .
//rest needs to be small cases.
//make sure to change name,age and city information with your personal information
//make sure to trim your sentences

//after those modifications
//print each sentence length , last index number
//print first,last and fifth character from each sentence.
//
    }
}
