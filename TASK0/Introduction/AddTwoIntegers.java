package TASK0.Introduction;

import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value A");
        int a = sc.nextInt();
        System.out.println("Enter the value B");
        int b = sc.nextInt();
        System.out.println("Total Sum of A and B");
        int c = a + b;
        System.out.println(c);

    }
}