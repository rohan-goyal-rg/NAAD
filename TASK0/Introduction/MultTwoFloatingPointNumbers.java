package TASK0.Introduction;

import java.util.Scanner;

public class MultTwoFloatingPointNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value A");
        float a= sc.nextFloat();
        System.out.println("Enter the value B");
        float b= sc.nextFloat();
        System.out.println("Total Float Multiply Sum of A and B");
        float c= a * b ;
        System.out.println(c);
    }
}
