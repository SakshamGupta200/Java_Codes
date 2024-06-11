import java.io.*;
import java.util.*;

public class arrayadd {
	public static boolean search(int ar[],int tar){
		int i=0;
		int j=ar.length-1;
		while(i<j){
			int sum = ar[i]+ar[j];
			if(sum == tar){
				return true;
			}
			else if(sum < tar){
				i++;
			}
			else{
				j--;
			}
		}
		return false;
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
		int tar = sc.nextInt();
		if(search(ar,tar)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
 
