//java program to demonstrate the usage of constructor
//19-09-23
//Hema
//DefaultConstructorDemo.java
import java.io.*;
import java.util.*;
class Rectangle {
    int l,b,a;
    Rectangle() {
        l=5;
        b=8;
        a=l*b;
    }
}
public class DefaultConstructorDemo {
    public static void main(String args[]) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        System.out.println("Area of Rectangle 1 is "+ r1.a);
        System.out.println("Area of Rectangle 2 is "+ r2.a);
    }
}