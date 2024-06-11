import java.util.ArrayList;
import java.util.Scanner;

public class StackImp {
    static ArrayList<Integer> stack = new ArrayList<>();

    static int i;
    static int n;
    static int choise;
    static int top=-1;
    public static void pop(){
        if (top == -1){
            System.out.println("Underflow :");
        }else {
            top = top-1;
        }
    }
    public static void push(int val){
        if (top == n){
            System.out.println("Overflow");
        }else {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter you elements :");
            val = sc.nextInt();
            top++;
            stack.add(val);
        }
    }
    public static void show(){
    if (top == -1){
        System.out.println("Stack is empty :");
    }else {

            System.out.println(stack);

    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number of elements in stack :");
        n= sc.nextInt();
        System.out.println("Stack operation :");
        while(choise != 4){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Show");
            System.out.println("4.Exit");
            System.out.println("Enter your choise : ");
            choise = sc.nextInt();
            switch(choise){
                case 1:
                    push(n);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    System.out.println("Thank you for using & get out ");
                    break;
                default :
                    System.out.println("Invalid operation choosen ! Try again :");
            }
        }
    }
}
