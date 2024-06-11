import java.util.Scanner;
public class GCD1 {
    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the two numbers: ");
        int x = 22;//sc.nextInt();
        int y = 95;//sc.nextInt();
        System.out.println("The GCD of two numbers is: " + findGCD(x, y));
    }

   static int findGCD(int x, int y) {
        int r = 0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}