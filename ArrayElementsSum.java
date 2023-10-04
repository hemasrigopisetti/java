//java program to find the sum of elements
//03-10-23
//Hema
//ArrayElementsSum.java
import java.io.*;
import java.util.*;
public class ArrayElementsSum {
    public static void main(String args[]) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" values in to the array ");
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of the given elements is "+sum);
    }
}