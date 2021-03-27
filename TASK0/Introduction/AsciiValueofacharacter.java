package TASK0.Introduction;

import java.util.Scanner;

public class AsciiValueofacharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character");
        char a= sc.next().charAt(0);
        System.out.println("Ascii of of char ");
        int b = a;
        System.out.println(b);
    }
}
