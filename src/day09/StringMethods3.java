package day09;

public class StringMethods3 {
    public static void main(String[] args) {
        String word="Ceylan Kaya";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        String word2="cEYLAN kAYA";
       // String firstName= word2.substring(0,1).toUpperCase() + word2.substring(1,5).toLowerCase();
        String firstName= word2.substring(0,1).toUpperCase().concat(word2.substring(1,6).toLowerCase());
        System.out.println("First Name is :"+ firstName);

        String lastName=word2.substring(7).toUpperCase();
        System.out.println("Last Name is: "+ lastName);

        String fullName=firstName.concat(" ").concat(lastName);
        System.out.println("Full Name is: "+ fullName);

        String str="       Ceylan   &&&&      Kaya        ";
        System.out.println(str.trim());






    }
}
