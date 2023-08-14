import java.util.*;
import java.util.Scanner;
public class Count_occurence {
     static int occ(int array[],int n){
         int count=0;
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         for (int i=0;i<n;i++){
             if(array[i]==x){
                 count++;
             }
         }
         

return count;
    }
    static int lastOcc(int array[],int x){
         int lastindex=-1;
        for (int i=0;i< array.length;i++){
            if(array[i]==x){
                lastindex =i;
            }
        }
        return lastindex ;
    }
    static int greaterthan(int array[],int x){
         int count =0;
        for (int i=0;i< array.length;i++){
            if(array[i]>x){
                 count++;
            }
        }
         return count;
    }
    static int target(int array[],int x){
        int count=0;
         for (int i=0;i<array.length;i++){
             for (int j=i+1;j< array.length;j++){
                 int sum=array[i]+array[j];

                 if (sum==x){
                     count++;
                 }

             }
         }
         return count;
    }
    static int triplet(int array[],int x){
         int count=0;
         for (int i=0;i<=array.length-2;i++){
             for (int j=i+1;j<=array.length-1;j++){
                 for(int k=j+1;k<=array.length-1;k++){
                     if(array[i]+array[j]+array[k]==x){
                         count++;
                     }
                 }
             }

         }

                 return count;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
           array[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int a=triplet(array,x);
        System.out.println(+ a);

    }



}

