package day02;

public class c4_arithmetichOperators {
    public static void main(String[] args){

        int i1=1;
        int i2=2;

        double d1=1.5;
        double d2=2.5;

        //sum of 2 number
        System.out.println(i1+i2);
        System.out.println(d1+d2);
        System.out.println(i1+d1);

        // minus operator
        System.out.println(d1-d2);
        System.out.println(d1-d2);
        System.out.println(i1-i2);

        //multiple numbers
        System.out.println(i1*i2); //1*2=2
        System.out.println(d1*d2); //1.5*2.2=3.75

        //division
        System.out.println(i2/i1);
        System.out.println(30/2); // 2     2 number are int result will be int number
        System.out.println(40.0/10); ///40.0 in here you have double number (decimal number20.0)result also should be double

        System.out.println(10/4); //result int
        System.out.println(11.0/4); //result decimal
        System.out.println(11/4.0); //result decimal
        System.out.println(-11/4); //result int
        System.out.println(-11.0/4);// result decimal

        System.out.println("*****************************");
        //reminder
        System.out.println(10/2);//devision returns 5
        System.out.println(10%2);//reminder is 0here
        System.out.println(10%3);//reminder means in turkish bolumunden kalan
        System.out.println(10.0%3);







    }
}
