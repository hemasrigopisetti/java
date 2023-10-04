//java program to demonstrate single level inheritance
//04-10-23
//Hema
//SingleInheritanceDemo.java
import java.io.*;
class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}
public class SingleInheritanceDemo {
    public static void main(String args[]) {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}