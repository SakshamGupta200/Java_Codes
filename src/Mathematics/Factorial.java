package Mathematics;

public class Factorial {
    public int Fact(int n){
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
