package TASK0.Decision_making_and_loops;

import java.util.Scanner;

public class DisplayFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1;

        System.out.println("Enter the value of n");
        int n=sc.nextInt();

        FibonacciNumbers(n,a,b);
    }
    static void FibonacciNumbers(int n,int a,int b) {
        if(n<=0){
            System.out.println("Invalid");
            return;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(a+",");
            int c=a;
            a=b;
            b=b+c;
        }
    }
}
