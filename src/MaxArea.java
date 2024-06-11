
      import java.io.*;
import java.util.*;

public class MaxArea {
	public static int findMaxWater(int ar[]){
		int i=0;
		int j=ar.length-1;
		int area=0;
		while(i<j){
			int len = (j-i);
			int bre = Math.min(ar[i],ar[j]);
			area = Math.max(area,len*bre);
			if(ar[i]<ar[j]){
				i++;
			}
			else{
				j--;
			}
		}
		return area;
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
		System.out.println(findMaxWater(ar));
	}
}


