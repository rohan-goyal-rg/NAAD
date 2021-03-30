package TASK0.Decision_making_and_loops;

import java.util.Scanner;

public class CountNumberofDigitsinanInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int b=a;
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
        System.out.println("Number of digits in "+b+" is "+count);
    }
}
