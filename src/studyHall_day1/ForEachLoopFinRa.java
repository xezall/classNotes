package studyHall_day1;

public class ForEachLoopFinRa {
    public static void main(String[] args) {
        FINRA();
    }
    public static void FINRA(){
        int[] numberList2={0,2,4,6,7,5,3,100,25,30};
        String str="";
        for (int num : numberList2){
            if(num%2==0 && num%3==0){
                str +="FINRA ";
            }else if(num%2==0){
                str +="FIN ";
            }else if(num%3==0){
                str +="RA ";
            }else{
                str +=num +" ";
            }

        }
        System.out.println(str);
    }

}
