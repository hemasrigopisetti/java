//java program display the elements of the array by using for each loop
//27-09-23
//Hema
//ArrayDemo.java
import java.io.*;
public class ArrayDemo {
    public static void main(String args[]) {
        int a[];
        a=new int[5];
        a[0]=11;
        a[1]=22;
        a[2]=33;
        a[4]=55;
        System.out.println("The Array elements are ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}