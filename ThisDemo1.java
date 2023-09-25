import java.io.*;
class Student
{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee)
    {
        rollno=rollno;
        name=name;
        fee=fee;
    }
    void display()
    {
        System.out.println("Student details are");
        System.out.println(rollno+" "+name+" "+fee);
    }
}
public class ThisDemo1
{
    public static void main(String args[])
    {
        Student s1=new Student(4225,"Hema",45700);
        Student s2=new Student(4224,"Vardhini",45700);
        s1.display();
        s2.display();
    }
}