package day30;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class CollectionPractice {
    public static void main(String[] args) {
        String word="helloworld";


String[] letters=word.split("");
        System.out.println(Arrays.toString(letters));
        LinkedHashSet<String> result =new LinkedHashSet<>(Arrays.asList(letters));
        System.out.println(result);

        String removeextraLetters="";
        for(String each:result){
            removeextraLetters+=each;

        }
        System.out.println(removeextraLetters);






    }
}
