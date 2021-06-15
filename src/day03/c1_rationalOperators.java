package day03;

public class c1_rationalOperators {

    public static void main(String [] args){
            //create variables
            int a=10;  // = this means assign 10 to a
            int b=10;
            boolean example= a == b ;
            // == equal operator
            System.out.println(example); // 10 == 15  false
            // !=  (oppesite equal ---> not equal)
            System.out.println(a != b ); // 10 != 15 true    //10 != 10
            // > operator
            System.out.println(a > b); // 10 > 15 false
            // < operater
            System.out.println( a < b ); // 10 < 15 true
            // >= operator
            System.out.println( a >= b); // 10 >= 15 false  it says if a is bigger or equal to b then it should be true
            // <= operator
            System.out.println( a <= b); // 10 <= 15  true   it says if a is smaller or equal to b then it should be true
        }
    }