package calismalar;

public class extask306062021 {
    public static void main(String[] args) {
//Question 1
//
//Write Java statements that do the following:
//a) Declare an array numArray of 15 elements of type int.
//b) Output the value of the tenth element of the array alpha.
//c) Set the value of the fifth element of the array alpha to 35.
//d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
//Question 2
//
//a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
//b) Write a loop that displays the contents of each element in the array that you declared.
//Question 3
//
//Write a program that creates an array of 10 elements size.
// Your program should prompt the user to input numbers in array and then display the sum of all array elements.
//Question 4
//
//The variable list1 and list2 are reference arrays that each have 5 elements.
// Write code that copies the values in list1 to list2. Values in list1 are input by user.
//Question 5
//
//Write a Java program to reverse the element of an integer  array.
//Question 6
//
//Write a Java program to find the largest and smallest element of an array.
//      // create a logic that will store 5 employees salaries (double) from scanner input
//    and print each salaries
//Output :
//
//Enter the salaries of 5 employees.
//234
//789
//123
//456
//453
//The salaries are:
//234.0
//789.0
//123.0
//456.0
//453.0


//task 1
//create a java program that will check months string and depends on number you passed
//you should be able to see month name
//example : 2 feb
//3 :mar
//numbers should be between 1 to 12 (included)
//if numbers are not between 1 to 12 print invalid number
//and give user 3 attempt if it is still not between 1 to 12 then stop whole system
//task2
//write a program that can return the average number from an array of integers
//            ex:
//                [20, 25, 15]
//                average: 20
//task3
//write a program that can return the largest string of text from an array
//ex         String[] names = {"akar", "byana", "can", "fexri", "jeniffer", "sevgin", "renastechschool"};
//output :renastechschool
//write a program that can return the shortest string of text from an array
////ex         String[] names = {"akar", "byana", "can", "fexri", "jeniffer",  "renastechschool","sevgin"};
//output : can
        String [] names = {"akar", "byana", "can", "fexri", "jeniffer", "sevgin", "renastechschool"};
        int max=names[0].length();//4 5 8 15
        String newmax="";

        for(int i=0;i<names.length;i++){
            if(names[i].length()>max){
                max = names[i].length();
                newmax =names[i];
            }
           // newmax =names[i];
           // System.out.println("The largest name of text from names array is "+ newmax);
        }
        System.out.println("The largest name of text from names array is "+ newmax);
        int min=names[0].length();
        String newmin="";
        for(int i=0;i< names.length;i++){
            if(names[i].length()<=min) {
                min = names[i].length();
                newmin = names[i];
            }
        }
        System.out.println("The smallest name of text from names array is " + newmin);



    }
}