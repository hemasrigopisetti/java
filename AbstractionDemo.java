import java.io.*;
abstract class Animal{
    public abstract void AnimalSound();
    public void sleep() {
        System.out.println("zzz");
    }
}
class Dog extends Animal {
    public void AnimalSound() {
        System.out.println("The dog sounds bow");
    }
}
public class AbstractionDemo {
    public static void main(String args[]) {
        Dog d=new Dog();
        d.AnimalSound();
        d.sleep();
    }
}