package calismalar;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a    ");
        System.out.println("J  J  aaaaa   V V  aaaaa     ");
        System.out.println(" JJ  a     a   V  a     a");

        //another  example
        System.out.println("\n\n" +(25.5*3.5-3.5*3.5)/(40.5-4.5));

        //another example
        System.out.println("\n\n " + 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        //Write a Java program to print the area and perimeter of a circle. Go to the editor
        //Test Data:
        //Radius = 7.5
        Scanner in=new Scanner(System.in);
        System.out.println("Please, input the value of radius : ");
        double radius= in.nextDouble();
        double perimeter= 2*Math.PI*radius;
        double area=Math.PI*radius*radius;

        System.out.println("The perimeter is : "+ perimeter );
        System.out.println("The area is "+ area);
        
        //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        Scanner in1=new Scanner(System.in);
        System.out.println("First number : ");
        double n1= in.nextDouble();
        System.out.println("Second number : ");
        double n2= in.nextDouble();
        System.out.println("Third number : ");
        double n3= in.nextDouble();

        System.out.println((n1+n2+n3)/3);




    }
}
