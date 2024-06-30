
      import java.io.*;
import java.util.*;

public class Merge {	
	static int[] merge(int ar1[],int ar2[]){
		int i=0;
		int j=0;
		int len = ar1.length+ar2.length;
		int tmp[] = new int[len];
		int k = 0;
		while(i<ar1.length && j<ar2.length){
			if(ar1[i]<ar2[j]){
				tmp[k++]=ar1[i++];
			}
			else{
				tmp[k++]=ar2[j++];
			}
		}
		while(i<ar1.length){
			tmp[k++] = ar1[i++];
		}
		while(j<ar2.length){
			tmp[k++] = ar2[j++];
		}
		
		return tmp;
	}


	public static void main(String[] args) {
		/*try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar1[] = new int[n];
		for(int i=0;i<n;i++){
			ar1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int ar2[] = new int[m];
		for(int i=0;i<m;i++){
			ar2[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(merge(ar1,ar2)));
	}
}

      

