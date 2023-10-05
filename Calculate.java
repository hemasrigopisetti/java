import java.io.*;
public class Calculate {
    static int cube(int x) {
        return x*x*x;
    }
    public static void main(String args[]) {
        int result=Calculate.cube(4);
        System.out.println("Cube of 4 is "+result);
    }
}