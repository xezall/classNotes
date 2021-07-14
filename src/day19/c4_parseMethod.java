package day19;

public class c4_parseMethod {
    public static void main(String[] args) {
    String str="1234";
        System.out.println(str + 12);
        int i=Integer.parseInt(str);
        System.out.println(i+12);

        String str2="30.27";
        double i1=Double.parseDouble(str2);

        String str3=" tRue ilkay true";
        boolean bool=Boolean.parseBoolean(str3);
        System.out.println(bool);//false
    }
}
