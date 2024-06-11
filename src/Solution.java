import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        int c=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");    
        int num = sc.nextInt();
        
        for(int i=2; i<(num/2); i++){
            if(num%i==0){
                
                 c = c*i; 
            }
        }
        if(c==num){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }  
    } 
}