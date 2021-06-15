package studyHall_day1;
import java.util.Scanner;
public class RemoveDuplicates {
    // Write a program that can ask the user enter a String (word), and can remove the duplicated characters
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String result = "";
        for (int i = 0; i <= word.length()-1; i++){
            String s = "" + word.charAt(i); // a, l, i, a
          /*
            if(result.contains(s)){ // a, l, i
                continue;
            }else{
                result += s;
            }
           */
            if(!result.contains(s)){
                result += s;
            }
        }
        System.out.println(result);
    }
}