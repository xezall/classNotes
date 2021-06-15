package day16;

public class c2_Methods {
    public static void main(String[] args) {
        ceylan();
        evenNumbers100();

    }


    public static void ceylan() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ceylan");
        }
    }
    public static void evenNumbers100(){
        String evennum="";
        for(int i=1;i<=100;i++){
            if(i%2==0){
                evennum +=i+",";
            }

        }
        System.out.println(evennum);

    }
}
