package day04;

public class practice {
    public static void main(String[] args){

        int x=600;
        int y=-250;
        int z=-300;

        boolean xMin= x<y && x<z;
        boolean yMin= y<z && y<z;
        boolean zMin= z<y && z<x;

        if (xMin){
            System.out.println(x + " is the minimum number between " + x + " , " + y + " , " + z );
        }
        if (yMin){ // false
            //java wont check inside this if
            System.out.println(y + " is the minimum number between " + x + " , " + y + " , " + z );
        }
        if (zMin){ // false
            //java wont check inside this if
            System.out.println(z + " is the minimum number between " + x + " , " + y + " , " + z );
        }
    }
}
