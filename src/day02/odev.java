package day02;

public class odev {

    public static void main(String[] args){
        //     1. Please create a class call variable practice and make sure to create at least
            String n1="Full Name : Ceylan Kaya ";

            String p="Phone Number : 123456789 ";

            System.out.println(n1+p);

            String n2="Full Name : Huseyin Filik ";
            String p2="Phone Number : 987654321";
            System.out.println(n2+p2);

//       2 different example for each data type we learned (byte,int,short,long,double,float,boolen and char)
        int a=75;
        System.out.println(a);

        double d=7.6;
        System.out.println(d);

//        2. Assigment create 3 number and use arithmetic operators (+ - * / %)

        byte b=57;
        int i=987654;
        float f=2.55555555555555555f;

        System.out.println("\n\n"+(b+i));
        System.out.println(i/b);
        System.out.println(i-b);
        System.out.println(i*b);
        System.out.println(i%b);
        System.out.println(i*f);
        byte b1=5;
        int i1=10;
        double d1=1.5;
        System.out.println("\n\n"+(b1+i1));
        System.out.println(i1/b1);
        System.out.println(b1-i1);
        System.out.println(i1*b1);
        System.out.println(i1%b1);
        System.out.println(i1*d1);



//              use each operator at least 2 times for your numbers


//        3. check if 350 is divisible by 2 , 3 , 5  (Check for each number)
        int i3=350;
        byte b3=2;
        byte b4=3;
        byte b5=5;
        System.out.println("\n\n"+(i3%b3));
        System.out.println(i3%b4);
        System.out.println(i3%b5);

//                      if it is divisible print : 350  is divisible by 2 true
//                      if it is not divisible print : 350 is divisible by 2 false
    }
}
