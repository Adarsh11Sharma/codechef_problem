import java.util.*;
import java.util.Scanner;


public class max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int[] array= new int [size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        Arrays.sort(array);
        int k=sc.nextInt();
//        int i=k;
        System.out.println(array[k-1]);
//        System.out.println("the array is");
//        for(int i=0;i<size;i++){
//            System.out.print(array[i]+" ");
//        }
    }}
