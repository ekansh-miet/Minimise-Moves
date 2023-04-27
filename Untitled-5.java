import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(), b=sc.nextLong(), c=sc.nextLong(), d=sc.nextLong();
        long d1=c-a;
        long d2=d-b;
        if(d1<=d2)
        System.out.println(2*d2-d1);
        else
        System.out.println("-1");
    }
}