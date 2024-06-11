import java.util.Scanner;

class sum{
    void area(int l, int b){
        int a = l * b;
    }


}
public class Inherit extends sum{
    void volume(int l, int b, int h ){
        int v = l * b * h;
    }
    public static void main(String[] args) {
        sum ob = new sum();
        Inherit obj = new Inherit();
        int l,b,h;
        int a,v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        l = sc.nextInt();
        System.out.println("Enter breadth : ");
        b = sc.nextInt();
        System.out.println("Enter height :");
        h = sc.nextInt();
        ob.area(l,b);
        System.out.println("Area is : "+ob);
        obj.volume(l,b,h);
        System.out.println("Volume is :"+obj);
    }
}
