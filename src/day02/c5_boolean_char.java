package day02;

public class c5_boolean_char {
    public static void main(String [] args){
        //        boolean          1 bit          Stores true or false values
        //        char             2 bytes            Stores a single character/letter or ASCII values   'a'
        boolean b1=true;
        boolean b2=false;
        System.out.println(b1);
        System.out.println(b2);
        boolean b3= 125 < 200 ;
//            boolean b4= 125; no condition here (neither true or false)
        System.out.println(b3); // true
        System.out.println(10 == 15); // false
        // == means equal
        // != not equal
        System.out.println( 10 != 20);
        System.out.println("*********************************");
        System.out.println( true == false );
        System.out.println(b1 == b2);
        // ! opposite
        System.out.println( !true == false ); // false == false  which is true
        System.out.println( !true == !false ); // false == true  which is false
        System.out.println( !(true == false) ); //  ( !(false) ) --- true
        System.out.println(  (true== true) == (false==false) );  // (true) == (true)  -- true
        System.out.println( (true!=false) ==  !(false==false));
        //( (true!=false) ==  !(false==false) )
        //( (true) ==  !(true) )
        //( (true) ==  false )
        // false
        //       char              2 bytes            Stores a single character/letter or ASCII values   'a'
        System.out.println("*********************************");
        char ch1= 'a'; // char is for single character
        //char ch2 = 'abc'  this wont work because it has 3 character
        System.out.println(ch1); // a
        char ch2='D';
        System.out.println(ch2);
        System.out.println('&');
        // from ascii table 97 is a
        int i1=97; // 97 is presenting a number
        char ch3=97; // 97 is presenting a character here which is a on ascii table
        System.out.println(i1); //97
        System.out.println(ch3); //a
        System.out.println(i1+ch3); //97 + 97
        // since i have int number and
        // i want to sum with char
        //java default will take char as a number
        //and sum 2 number
//            char ch4= (char) (i1+ch3);  // this is casting means force java to tell this is char
//
//            System.out.println(ch4); // 194  Â
        int i2= 'c';  // java will take number of character c which is 99 from ascii
        System.out.println(i2);
    }
}
