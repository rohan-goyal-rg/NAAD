package TASK0.Introduction;

import java.util.Scanner;

public class FindtheLargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number");
        int b = sc.nextInt();
        System.out.println("Enter The Thrid Number");
        int c = sc.nextInt();
        if (a >= b && a >= c)
            System.out.println(a + " is Largest Number");
        else if(b >= a && b >= c)
            System.out.println(b + " is Largest Number");
        else
            System.out.println((c + " is Largest Number"));

    }
}
