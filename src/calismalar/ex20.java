package calismalar;

import java.util.Arrays;
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        //Question 1
//
//Write Java statements that do the following:
//a) Declare an array numArray of 15 elements of type int.
//b) Output the value of the tenth element of the array alpha.
//c) Set the value of the fifth element of the array alpha to 35.
//d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
        int[] numArray = new int[15];
        System.out.println(numArray[9]);
        numArray[4] = 35;
        numArray[8] = numArray[5] + numArray[12];
        //Question 2
//
//a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
//b) Write a loop that displays the contents of each element in the array that you declared.
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(Arrays.toString(days));
        for(int i=0;i< days.length;i++){
            System.out.println(days[i]);
        }
        System.out.println("-------------------------------------");
        //Question 3
//
//Write a program that creates an array of 10 elements size.
// Your program should prompt the user to input numbers in array and then display the sum of all array elements.
        int [] arr=new int[10];

        for(int i=0; i<arr.length;i++){
            Scanner scan=new Scanner(System.in);
            System.out.println("Please, type value of elements : ");
            arr [i] =scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));



    }
}