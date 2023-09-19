class Sample {
    protected String job;
}
public class ProtectedDemo extends Sample {
    public static void main(String args[]) {
        Sample s=new Sample();
        s.job = " Studying ";
        System.out.println(" Job is "+ s.job);
    }
}