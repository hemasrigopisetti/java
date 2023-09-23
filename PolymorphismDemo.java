import java.io.*;
class Animal{
    public void AnimalSound() {
        System.out.println("An Animal can make sounds");
    }
}
class Cow extends Animal {
    public void AnimalSound() {
        System.out.println("A Cow sounds-maa");
    }
}
class Cat extends Animal {
    public void AnimalSound() {
        System.out.println("A Cat sounds-meow");
    }
}
public class PolymorphismDemo {
    public static void main(String args[]) {
        Animal an=new Animal();
        Animal mycow=new Cow();
        Animal mycat=new Cat();
        an.AnimalSound();
        mycow.AnimalSound();
        mycat.AnimalSound();
    }
}