package day05;

public class c1_ifElseStatements {

    public static void main(String[] args){
        // 2 number
        //please create a java program to check if this 2 number equel or not
        //if it is equal print : numbers are equal
        //if it is not print: numbers are not equal

        int x=10;
        int y=11;

        boolean bool1= x==y;
        if (bool1){
            System.out.println("numbers are Equal!!!!");

        }else {// this block will cover whatever left from first if condition
            //not equal
            System.out.println("Numbers are not Equal!!!");
        }

        if (1+1==2){
            System.out.println(" 1+1 != "+ (1+1));
            System.out.println(" 1+1 is  2");
        }else{
            System.out.println(" 1+1 != "+ (1+1));
            System.out.println(" 1+1 is not 2");

        }
        // even numbers  -- if is number can be divided by 2 (if reminder is 0) then we call this number even number
    // odd numbers   -- if is number cant be divided by 2 (if reminder is not 0) this will odd number
        //please create a java program that will check if number is even or odd number
            //if it is even print : number is even number
            //if it is odd number print number is odd number

        int w ;
        w=22;
        System.out.println(x);

        if (w%2==0){
            System.out.println(w +" is even Number !");

        }else{
            System.out.println(w +" is odd Number !");

        }



    }
}
