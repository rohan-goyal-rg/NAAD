package TASK0.Decision_making_and_loops;

import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int b=a;
        int r=0;

        while(a>0){
            r=r*10+(a%10);
            a=a/10;
        }
        System.out.println("The reverse value of "+b +" is "+r);
    }
}
