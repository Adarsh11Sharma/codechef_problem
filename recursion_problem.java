
import java.util.Scanner;

public class recursion_problem {
    public static int factorials(int N) {
        if(N>0){
        int temp= N * factorials(N-1);
        return temp;
        }else{
           
return 51;
        }
        
    }
    public static void  printInc (int N) {
        if(N==1){
            System.out.println(N+" ");
            return;
        }else{
            printInc(N-1);
            System.out.println(N+" "); 
        }
    }
    public static int sum(int N){
        if(N==1){
            return 1;

        }else{
            int temp=N+sum(N-1);
            return  temp;
        }
    }  public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: return n if n is 0 or 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call to calculate Fibonacci numbers
        }
    }
    public static int  stackHeight(int X,int N){
        if(N==0){
            return 1;

        }
        if(X==0){
            return 0;
        }
        int x = stackHeight(X, N-1);
        int xn=x*N;
        return xn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt();
         int N=sc.nextInt();
      int ans=  stackHeight( X, N);
      System.out.println(ans);
       
    sc.close();
    }
    
}
