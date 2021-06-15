package day06;

public class c1_ternaryPractice {
    public static void main(String[] args){

        //Task1 :create a java project that will check if number is even or odd
        //Task2 :create a java program that will check if number is divisible by 2 and 5 same time
        //please solve the task with if statement and ternary statement

            //Task1 :create a java project that will check if number is even or odd
            int number ;
            number=25;
            String result="";
            //lets try with if statement
            if (number % 2 == 0){
                result = "Number is Even";
            }else {
                result = "Number is Odd";
            }
            System.out.println(result);
            //ternary practice
            //if ?
            //else :
            String result2= (number % 2 == 0) ? "Number is even" : "Number is Odd" ;
            System.out.println(result2);
            //Task2 :create a java program that will check if number is divisible by 2 and 5 same time
            int i1=10;//1
            int i2=15;
            //(i1*i2)  150
            boolean divisibleBy2and5 = ( (i1*i2) % 2 ==0 && (i1*i2) % 5 ==0) ? true : false;
            System.out.println((i1*i2)+" is divisible by 2 and 5 :" + divisibleBy2and5);
        }
    }