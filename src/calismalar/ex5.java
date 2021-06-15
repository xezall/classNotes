package calismalar;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //Write a Java program to print the area and perimeter of a rectangle.
        Scanner in=new Scanner(System.in);
        System.out.println("width : ");
        double w= in.nextDouble();
        System.out.println("Height : ");
        double h= in.nextDouble();
        double perimeter=2 * (w+h);
        double area= w * h ;
        System.out.println("The perimeter of rectangle is : "+ perimeter);
        System.out.println("The area of rectangle is : "+ area);

        //Write a Java program to swap two variables.
        int a, b, c;
        a=16;
        b=25;
        c=a;
        a=b;
        b=c;
        System.out.println(a + ","+ b);

        //with scanner

        Scanner in1=new Scanner(System.in);
        System.out.println("Input the value x :");
        double x= in.nextDouble();
        Scanner in2=new Scanner(System.in);
        System.out.println("Input the value y :");
        double y= in.nextDouble();
        double z;
        z=x;
        x=y;
        y=z;
        System.out.println(x + "," + y);




    }
}
