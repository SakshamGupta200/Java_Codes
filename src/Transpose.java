import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Transpose {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int i,j;
        int N;
        N=sc.nextInt();
        int a[][] = new int[N][N];
        int b[][] = new int [N][N];
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                a[i][j]=sc.nextInt();
                b[j][i]=a[i][j];
                System.out.print(b[i][j]);
            }
            System.out.println();
        }


    }
}