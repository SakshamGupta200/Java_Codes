package MyPack1;



public class Sample {

    private int x=40;// Value of x is accessed in Sample class not outside the class.

    public void show(){
        System.out.println("Value of x = "+x);
    }
    public void display(){
        System.out.println("Good Morning");
    }
    protected void show1(){
        System.out.println("Good Night ");// Using with the help of child class objects.
    }
    public void get(){
        System.out.println("Hii");
    }

}
