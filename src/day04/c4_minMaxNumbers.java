package day04;

public class c4_minMaxNumbers {
    public static void main(String[] args){

        // x y z
        // min number
        // create a logic that will going to print minumum number between 3 numbers
        int x= 245;
        int y = -500;
        int z= 0;
        boolean xMin= x<y && x<z ;  // false && false == false
        //x has to smaller then y and smaller then z
        boolean yMin= y<x && y<z ; // true && true = true
        //if y is minimum number then y has to be smaller then x and z
        boolean zMin= z<x && z<y ; // true && false == false
        if (xMin){//false
            //java wont check inside this if
            System.out.println(x + " is the minimum number between " + x + " , " + y + " , " + z );
        }
        if (yMin){//true
            System.out.println(y + " is the minimum number between " + x + " , " + y + " , " + z );
        }
        if (zMin){ // false
            //java wont check inside this if
            System.out.println(z + " is the minimum number between " + x + " , " + y + " , " + z );
        }
        // create a logic that will going to print maximum number between 3 numbers

        int number1=10;
        int number2=20;
        int number3=30;
        //if number1 is the max number it has to be bigger then number2 and number3
        if (number1>number2 && number1>number3){
            //if true it will check inside of if
            System.out.println(number1 + " is biggest number between " +
                    number1 + " , "  + number2 + " , " + number3);
        }
        boolean number2max=number2 > number1 && number2>number3;
        boolean number3max=number3 > number1 && number3>number2;
        if (number2max){
            //if true it will check inside of if
            System.out.println(number2 + " is biggest number between " +
                    number1 + " , "  + number2 + " , " + number3);
        }
        if (number3max){
            //if true it will check inside of if
            System.out.println(number3 + " is biggest number between " +
                    number1 + " , "  + number2 + " , " + number3);
        }



    }
}