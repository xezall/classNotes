package studyHall_day1;

import java.util.Scanner;

public class combineTwoStrings {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();
        char ch1=str1.charAt(str1.length()-1);
        char ch2=str2.charAt(0);
        if(ch1==ch2){
            System.out.println(str1+str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }
    }
}
