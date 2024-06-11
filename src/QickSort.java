
      import java.io.*;
import java.util.*;

public class QickSort {
	static int partition(int ar[],int l,int h){
		int i=l-1;
		int piv = ar[h];
		for(int j=l;j<=h-1;j++){
			if(ar[j]<piv){
				i++;
				int tmp = ar[j];
				ar[j] = ar[i];
				ar[i] = tmp;
			}
		}
		int tmp = ar[i+1];
		ar[i+1] = ar[h];
		ar[h] = tmp;
		return i+1;
	}
	public static void sort(int ar[],int l,int h){
		if(l<h){
			int m = partition(ar,l,h);
			sort(ar,l,m-1);
			sort(ar,m+1,h);
		}
	}

	public static void quickSort(int ar[]){
		sort(ar,0,ar.length-1);
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
		quickSort(ar);
		System.out.println(Arrays.toString(ar));
	}
}


