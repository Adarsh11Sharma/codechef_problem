import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListSorting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int num=sc.nextInt();
            arr.add(num);
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
