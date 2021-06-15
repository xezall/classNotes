package day16;

public class c4_ReverseMethod {
    public static void main(String[] args) {
        String name1="Rustem";
        reverseString(name1);
        reverseString("heshu");
        reverseString("i love my family!");

    }
    public static void reverseString(String str){
        for(int i=str.length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
