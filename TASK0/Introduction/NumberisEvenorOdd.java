package TASK0.Introduction;

import java.util.Scanner;

public class NumberisEvenorOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int A= sc.nextInt();

        if(A%2==0)
            System.out.println(A + " is a Even");
        else
            System.out.println(A + " is a odd");
    }
}
