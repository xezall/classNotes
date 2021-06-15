package calismalar;

public class ex1 {
    public static void main(String[] args){
        //Task1 :create a java project that will check if number is even or odd
        int x1=39;

        if (x1%2==0){
            System.out.println(x1 + " is even number!");
        }else{
            System.out.println(x1 + " is odd number!");
        }
        String message;
        String message1= x1 + " is even number!";
        String message2= x1 +" is odd number!";
        message= ( x1%2==0 )  ? message1 : message2;
        System.out.println(message);




        //Task2 :create a java program that will check if number is divisible by 2 and 5 same time

        int x2= 13;
        String m1,m2;
        m1=x2+ " is divisible by 2 and 5 .";
        m2=x2 + " is not divisible by 2 and 5";
        if (x2%2==0 && x2%5==0){
            System.out.println(x2+ " is divisible by 2 and 5 .");

        }else{
            System.out.println(x2 + " is not divisible by 2 and 5");
        }
        String result;
        result=(x2%2==0 && x2%5==0)? m1: m2;
        System.out.println(result);
        //please solve the tasks with 2 methods ( if statement and ternary statement)

    }
}
