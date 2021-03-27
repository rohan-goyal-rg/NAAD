package TASK0.Introduction;

import java.util.Scanner;

public class ComputeQuotientandRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Dividend");
        int Dividend = sc.nextInt();
        System.out.println("Enter The Divisor");
        int Divisor = sc.nextInt();
        int Quotient = Dividend / Divisor ;
        int Remainder = Dividend % Divisor ;
        System.out.println("Quotient  \n " + Quotient);
        System.out.println("Remainder  \n " + Remainder );

    }
}
