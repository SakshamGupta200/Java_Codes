import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        int X,N,c,d;
        Scanner sc =new Scanner(System.in);
        X=sc.nextInt();
        N=sc.nextInt();
        c=X*N;
        d=c*N;
        System.out.println(d);
    }
}