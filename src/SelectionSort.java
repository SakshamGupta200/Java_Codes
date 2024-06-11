import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        //Initialize array
        int n;
        Scanner sc=new Scanner(System.in);
      /* System.out.println("Enter the size of array :");
        n= sc.nextInt();*/
        // int [] arr = new int [n]; // {5, 2, 8, 7, 1};
        int [] arr = new int [] {5, 2, 8, 7, 1};
        int temp = 0;
        /*System.out.println("Enter the elements :");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }*/

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
