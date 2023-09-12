//java program to find the sum of first n natural numbers
//12-09-23
//Hema
//SumOfNaturalNumbers.java
import java.io.*;
import java.util.*;
public class SumOfNaturalNumbers {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println(" Sum of first "+n+" natural numbers is " + sum);
}
}