
import java.util.HashSet;

public class Libraries{
    public static void main(String[] args) {
        HashSet<Float> myHashSet = new HashSet<>();
        myHashSet.add(1.1F);
        myHashSet.add(2.1F);
        myHashSet.add(3.1F);
        myHashSet.add(4.1F);
        myHashSet.add(5.1F);
        System.out.println("size of my hash set: " + myHashSet.size());
        System.out.println("Printing values now: ");
        for(float values : myHashSet){
            System.out.println(values);
        }
    }
}