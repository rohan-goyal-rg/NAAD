package TASK0.Arrays;

import java.util.Scanner;

public class CalculateAverageaUsingArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        for (int i = 0; i <array.length ; i++) {
            array[i]=sc.nextInt();
        }

        int sum=0;
        for (int i:array){
            sum+=i;
        }
        System.out.println("Average is "+ sum/array.length);
    }
}
