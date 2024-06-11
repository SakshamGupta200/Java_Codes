import java.io.*;
import java.util.*;

public class InsertionSort {
	public static void inserstionSort(int ar[]){
		for(int i=1;i<ar.length;i++){
			int key=ar[i];
			int j = i-1;
			while(j>=0 && ar[j]>key){
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = key;
		}
	}
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++){
			ar[i] = sc.nextInt();
		}
		inserstionSort(ar);
		System.out.println(Arrays.toString(ar));
	}
}
