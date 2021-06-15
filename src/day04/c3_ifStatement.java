package day04;

public class c3_ifStatement {

    public static void main (String [] args){
    boolean bool1= 10 >5; //true
    boolean bool2=false;
    if (bool1){ // this is openiing bracket for if
        System.out.println("print me");
        System.out.println("Hello");
    } // this is closing bracket for if
    if ( bool2 ){ //since this condition is false java wont check inside of this if
        System.out.println("print me 2 ");
        System.out.println("Hello 2");
    }
    System.out.println("Hello 3");
    if (2==2){ // true condtion
        //it is gonna go inside if since it is true
        System.out.println(4);
    }
    if (2!=2) {// false condtion then java wont check your inside of your if statement
        System.out.println(5);
    }
}
}
