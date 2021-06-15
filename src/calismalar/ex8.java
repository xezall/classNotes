package calismalar;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ex8 {
    public static void main(String[] args) {


        boolean b1 = 23 == 23;
        System.out.println(b1);

        if(b1){
            System.out.println(b1+" is true");
        }else {
            System.out.println(b1+" is not true");
        }
        int i= -10*10;

        boolean b2= i<0;
        boolean b3=i>0;
        if(b2){
            System.out.println(i+" is negative.");
            if(i<-100){
                System.out.println( i +  " is less than minus 100");
            }else if(i>-100){
                System.out.println(i+" is more than minus 100");
            }else{
                System.out.println(i+" is the number which i am looking forward for many years");
            }
        }else if(b3){
            System.out.println(i+" is positive.");

        }else {
            System.out.println(i+" is notr.");
        }
    }
}
