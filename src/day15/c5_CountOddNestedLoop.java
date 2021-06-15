package day15;

public class c5_CountOddNestedLoop {
    public static void main(String[] args) {
        int[][] numberList2D= {
                {10, 11, 12, 13},
                {15, 16, 17},
                {1,2,3,4,5,6,7},
                {2,4,6,10}
        };

        int countOdd=0;
        int countEven=0;
        int sumOfOdd=0;
        int sumOfEven=0;

        for (int[] each1D : numberList2D){
            for(int eachnumber : each1D){
                if(eachnumber % 2  ==0 ){
                    countEven++;
                    sumOfOdd+=eachnumber;
                }else{
                    countOdd++;
                    sumOfOdd+=eachnumber;
                }
            }
        }
        System.out.println("count of odd numbers is: "+countOdd +"sum of odd numbers :"+sumOfOdd);
        System.out.println("count of even numbers is: "+countEven +"sum of even numbers :"+sumOfEven);


    }
}
