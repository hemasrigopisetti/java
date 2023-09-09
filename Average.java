//Average.java
//22-8-23
//Hema
import java.io.*;
import java.util.*;
public class Average{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of 3 subjects");
int s1=sc.nextInt();
int s2=sc.nextInt();
int s3=sc.nextInt();
int total=s1+s2+s3;
float avg=total/3;
System.out.println("The total marks of the student is" + total);
if(avg>=75)
{
System.out.println("Student avg is" + avg +" student passed in the distinction");
}
else if (avg>=60 && avg<=75)
{
System.out.println("Student avg is" + avg +" Student passed in first class"); 
}
else if(avg>=50 && avg<=60)
{
System.out.println("Student avg is" + avg +" student is second class");
}
else
{
System.out.println("Student avg is" + avg +" student is falied");
}
}
}