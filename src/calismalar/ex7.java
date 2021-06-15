package calismalar;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner ceylan=new Scanner(System.in);
        System.out.println("En sevdigin meyve :");
        String s=ceylan.next();
        System.out.println(s +" is my favorite fruit !");
        Scanner ilkay=new Scanner(System.in);
        System.out.println("Kac yillik arkadassiniz?");
        byte b=ilkay.nextByte();
        System.out.println(b+ " yillik arkadasiz");
    }
}
