package TASK0.Introduction;

import java.util.Scanner;

public class FindallRootsofaQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value A");
        float a= sc.nextFloat();
        System.out.println("Enter the value B");
        float b= sc.nextFloat();
        System.out.println("Enter the value c");
        float c= sc.nextFloat();

        float rootA,rootB,rootC;


        float d= b*b - 4 * a * c;
        System.out.println("Solution of B`B - 4AC \n " + d );

        if (d > 0)
        {
            rootA=(float) (-b + Math.sqrt(d)) / (2*a);
            rootB=(float) (-b - Math.sqrt(d)) / (2*a);
            System.out.format("Real =%.2f \n Real =%.2f",rootA , rootB);
        }
        else if (d ==0)
        {
            rootA=rootB=(-b/2*a);
            System.out.format("Real and equal=%.2f", rootB);
        }
        else {
            rootC=(float) Math.sqrt(-d) / (2 * a);
            System.out.format("Imaginary= %.2f \n ", rootC);
        }
    }
}
