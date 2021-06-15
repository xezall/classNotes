package calismalar;

public class ex10 {
    public static void main(String[] args) {
        int a= -10; //-11  //-10 // -10 //-11
        int b= --a + a++   -  ++a  + --a*2 + 10/2 - 10%3 ;//
            // -11 + -11  -  -9  + -10*2 +5-1
            // -43 +14
        //-29
        System.out.println(b);
        System.out.println(a);
    }
}
