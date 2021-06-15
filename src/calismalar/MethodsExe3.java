package calismalar;

import java.util.Scanner;

public class MethodsExe3 {
    public static void main(String[] args) {
        RemoveDuplicates();

    }
    //(String) Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC
    public static void RemoveDuplicates(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your message : ");
        String str=scan.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
            String letters =""+str.charAt(i);
            if(!result.contains(letters)){
                result +=letters;
            }
        }
        System.out.println(result);

    }
}
