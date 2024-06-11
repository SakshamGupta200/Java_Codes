
import MyPack1.Sample;
import Mathematics.*;


public class PackImp extends Sample{
    public static void main(String[] args) {
        int a;
        Factorial d;
        d = new Factorial();
        a=d.Fact(5);
        System.out.println("Factorial = "+a);
        Square S= new Square();
        PackImp PI=new PackImp();
        int b;
        b=S.Square(55);
        System.out.println("Square = "+b);

        Sample S1=new Sample();
        S1.show();
        // System.out.println(S1.x);
        PI.show1();
        // S1.display();
    }
}
