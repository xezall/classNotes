package calismalar;

import java.util.Scanner;

public class MethodsExe {
    //(String) Reverse
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA
    public static void Reverse() {

        String str = "ABCD";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));

        }
        System.out.println();
    }

    public static void main(String[] args) {
      Reverse();
      reverse("ilkay");
      reverse("ceylan");

        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your sentence : ");
        String a=scan.nextLine();
        reverse(a);

        reverse("sanane");


    }
    public static void reverse(String ilkay){


        for (int i = ilkay.length() - 1; i >= 0; i--) {
            System.out.print(ilkay.charAt(i));

        }
        System.out.println();


    }
}
