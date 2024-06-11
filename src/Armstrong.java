import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int b,a,c,n=153;
       /* Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();*/
        a=n;
        c=0;
        while (n>0){
            b=n%10;
            c=c+(b*b*b);
            n=n/10;
        }
        if (c == a){
            System.out.println(a+ " is armstrong number.");
        }
    }
}
