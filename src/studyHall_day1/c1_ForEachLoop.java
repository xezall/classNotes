package studyHall_day1;

public class c1_ForEachLoop {
    public static void main(String[] args) {
        String [] cars={"Ferrari","BMW","GTI","Mercedes"};
        for(String i:cars){
            System.out.print(i+" ");
        }
        //sumofnumbers with for each loop
        int[] numbers={3,4,5,-5,0,12};
        int sum=0;
        for (int a : numbers){
            sum +=a;
        }
        System.out.println("Sum = "+ sum);


    }
}
