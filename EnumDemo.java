//java program to demonstrate Enums
//19-10-23
//Hema
//EnumDemo.java
public class EnumDemo {
    public enum Season{SUMMER,WINTER,SPRING,FALL}
    public enum Week{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
    public static void main(String args[]) {
        System.out.println("The values of season are ");
        for(Season s:Season.values())
        {
            System.out.println(s);
        }
        for(Week w:Week.values())
        {
            System.out.println(w);
        }
    }
}