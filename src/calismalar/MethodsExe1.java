package calismalar;

import java.util.Arrays;

public class MethodsExe1 {
    public static void main(String[] args) {
    SameLetter();
    }
    //(String) Same Letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false:
    public static void SameLetter(){
        String str1="abc";
        String str2="cab";
        String str3="abb";
        String [] letters1=str1.split("");

        String [] letters2=str2.split("");

        String [] letters3=str3.split("");

        Arrays.sort(letters1);

        Arrays.sort(letters2);

        Arrays.sort(letters3);

            if (Arrays.equals(letters1,letters2)){

                System.out.println(str1 +" is build out same letters with "+str2+ " that's why it is true");
            }else {
                System.out.println(str1 +" is not build out same letters with "+str2+ " that's why it is false");
            }

            if(Arrays.equals(letters1,letters3)){

                System.out.println(str1 +" is build out same letters with "+str3+ " that's why it is true ");
            }else{
                System.out.println(str1 +" is build out same letters with "+str3+ " thats why it is false");
            }
    }
}
