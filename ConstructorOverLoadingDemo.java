//java program to demonstrate parameterized constructor
//19-09-23
//Hema
//ConstructorOverLoadingDemo.java
import java.io.*;
import java.util.*;
class Square {
    int s;
    Square() {
        s=5;
    }
    Square(int x) {
        s=x;
    }
    void area() {
        System.out.println("Area of the Square is "+ s*s);
    }
}
public class ConstructorOverLoadingDemo {
    public static void main(String args[]) {
        Square s1=new Square();
        Square s2=new Square(8);
        s1.area();
        s2.area();
    }
}