package day20;

import java.util.Arrays;

public class c1_SumOfDigit {
    public static void main(String[] args) {
         /*
    write a program that can return the sum of all the digits from a string
            ex:
                input: "hello 5world a1b2c3"
                output: 11
                    (1+2+3 + 5=11)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */
        String str="hello 5world a1b2c3";
        char [] chr=str.toCharArray();
        System.out.println(Arrays.toString(chr));
        int result=0;
        int result2=0;
//        int index=str.length();
        for(int i=0;i<str.length();i++){
            if (chr[i]>47 && chr[i]<58){
                result += Integer.parseInt(""+chr[i]);
            }
           // System.out.println(result);
            if(Character.isDigit(chr[i])){
                result2 +=Integer.parseInt(""+chr[i]);
            }
        }
        System.out.println(result);
        System.out.println(result2);



    }


}
