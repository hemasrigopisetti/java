//java program to find the average and display the class of a student
//23-08-23
//Hema
//NestedIfExample.java
import java.io.*;
import java.util.*;
public class NestedIfExample{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of 3 subjects");
float s1=sc.nextFloat ();
float s2=sc.nextFloat ();
float s3=sc.nextFloat ();
float total=s1+s2+s3;
float avg=total/3;
System.out.println("The total marks of the student is" + total);
if(avg>=75)
{
if(avg>=95)
{
System.out.println("Student average is "+avg+" your average is top 5 percent ");
}
else if(avg>=90)
{
System.out.println("Student average is "+avg+" student passed with distinction ");
}
}
else if(avg>=60 && avg<=75)
{
System.out.println("Student average is "+avg+" student passed in first class");
}
else
{
System.out.println("Student is failed");
}
}
}