import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ArrRev {
    public static void main (String[] args) {
        // Your code here

        int i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}