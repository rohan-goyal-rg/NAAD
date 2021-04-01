package TASK0.Introduction;

import java.util.Scanner;

public class ToRoundaNumbertonDecimalPlaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Floating  Value");
        float a=sc.nextFloat();

        System.out.println("Enter the round place value");
        int roundPlace= sc.nextInt();

        System.out.format("%."+roundPlace+"f",a);
    }
}
