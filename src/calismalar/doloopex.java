package calismalar;

import java.util.Scanner;

public class doloopex {
    public static void main(String[] args) {
        //Task 1
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
// negative and zeros entered.
        Scanner scan = new Scanner(System.in);
        int a = 3;
        String negative = "";
        String neutral = "";
        String positive = "";
        char choice;
        do {

            for(int i=1; i<=a; i++) {
                System.out.println("Please Write your number : ");
                int num = scan.nextInt();

                if (num < 0) {
                    negative += num + " ";
                    System.out.println(negative + " is negative number");

                } else if (num == 0) {
                    neutral += num + " , ";
                    System.out.println(neutral + " is neutral number ");

                } else {
                    positive += num + " ,";
                    System.out.println(positive + " is positive number");
                }

            }
            System.out.println("Would you like to continue ? Yes or NO : ");
            choice = scan.next().charAt(0);


        } while (choice == 'y' || choice == 'Y');

        //Task 2
//Write a program to enter the numbers till the user wants and at the end the program should display
// the largest and smallest numbers entered.
        do {

            System.out.println("Please enter your first number : ");
            int num2 = scan.nextInt();
            System.out.println("Please enter your second number : ");
            int num3 = scan.nextInt();
            System.out.println("Please enter your third number : ");
            int num4 = scan.nextInt();
            if (num2 > num3 && num2 > num4 ) {
                System.out.println(num2 + " is max number. ");
            } else if (num3 > num2 && num3 > num4) {
                System.out.println(num3 + " is max number. ");
            } else  {
                System.out.println(num4 + " is max number. ");
            }

            if (num2 < num3 && num2 < num4 ) {
                System.out.println(num2 + " is min number. ");
            } else if (num3 < num2 && num3 < num4) {
                System.out.println(num3 + " is min number. ");
            } else if (num4 < num2 && num4 < num3) {
                System.out.println(num4 + " is min number. ");
            }
            System.out.println("Would you like to continue ? Yes or NO : ");
            choice = scan.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');
        //Tak 3
//Write a program to print Fibonacci series of n terms where n is input by user :
        int k=0;
        int x=1;
        int y=1;
        System.out.print(k+ " "+ x +" "+y+" ");
        while (x<=1000){
            k=x+y;
            System.out.print(k +" ");
            x=y;
            y=k;
            //k=x+y;
            //System.out.print(k+" ");

        }



    }




}
