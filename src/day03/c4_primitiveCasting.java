package day03;

public class c4_primitiveCasting {

    public static void main(String[] args){

        //we have 2 type of primitive casting
        //1.implicit casting (done automaticly from java)
        //2.explicit casting (needs to be handle manually)
        //double > float > long > int > short > byte
        byte b1=20; // -128 to 127
        long l1=b1;  // this is implicit casting (done automaticly by java ) since long is bigger then byte
        int i1=10;
        byte b2=(byte)i1; //casting done by programmer manually // explicit casting
        double d1=2.3;
        float f1= (float) d1;// explicit casting
        int i2= 2000;
        long l2= i2; // implicit casting
        short s1=(short) l2;// explicit casting
        byte b3= (byte) s1; // explicit casting
    }
}