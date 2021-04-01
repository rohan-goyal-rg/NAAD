package TASK0.Type_Conversion;

import java.util.Scanner;

public class ToconvertinttypevariablestoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        int a=sc.nextInt();

        String str=""+a;

        System.out.println("The String value of Integer "+a+" is "+str);
    }
}
