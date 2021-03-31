package TASK0.Arrays;

import java.util.Scanner;

public class ConcatenateTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The first array");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter The second array");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]=sc.nextInt();
        }
        int[] newArr=new int[m+n];
        for (int i = 0; i <n ; i++) {
            newArr[i]=arr1[i];
        }
        for (int i = n; i <n+m ; i++) {
            newArr[i]=arr2[i-n];
        }
        System.out.println("The NewArray is ");
        for (int i :newArr) {
            System.out.println(i+" ");
        }
    }

}
