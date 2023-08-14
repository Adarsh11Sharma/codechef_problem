import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        Long sum = 000000000000000000000000000L;
        Long arr[]=new Long[Math.toIntExact(n)];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            sum = arr[i]+sum;
        }

        System.out.println(sum);





    }
}
