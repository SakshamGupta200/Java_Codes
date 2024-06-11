

import java.util.Scanner;

interface Myint{
    void msg();
    int sum(int a, int b);
}


public class Interface implements Myint{

    public void msg() {
        System.out.println("good morning");
    }


    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Interface ob=new Interface();

        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        a= sc.nextInt();
        b= sc.nextInt();
        ob.msg();
        c= ob.sum(a,b);
        System.out.println("Sum = "+c);
    }
}
