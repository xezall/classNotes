package calismalar;

import java.util.Scanner;

public class doLoopEx2 {
    public static void main(String[] args) {
        //task 5 print below figure
//a b c d e f g h i j k l m n o p q r s t u v w x y z
//a b c d e f g h i j k l m n o p q r s t u v w x y
//a b c d e f g h i j k l m n o p q r s t u v w x
//...
//...
//a b c
//a b
//
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your charecter : ");
        char ch=scan.next().charAt(0);
        for ( char chr1=ch; chr1 >='a' ; chr1--){
            for(char chr2='a';chr2<= chr1 ; chr2++ ){
                System.out.print(chr2);
            }
            System.out.println();
        }
    }
}
