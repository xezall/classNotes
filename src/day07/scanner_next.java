package day07;

import java.util.Scanner;

public class scanner_next {
    public static void main(String[] args) {

            //for the string to be able to use scanner you neeed to call next method
            //2 way to create next and nextline
            Scanner input=new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstName=input.next();
            System.out.println("Enter Last Name");
            String lastName=input.next();
            String fullName=firstName + "  "+lastName;
            System.out.println(fullName);
            System.out.println("Grade For Student ");
            int grade=input.nextInt();
            System.out.println(fullName + " grade is :" +grade);
            System.out.println("letter grade for student");
            String gradeLetter=input.next();
            System.out.println(gradeLetter);
        }
    }