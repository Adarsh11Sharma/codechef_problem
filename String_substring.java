import java.util.*;
public class String_substring {
    static void substring(String str){
        int n=str.length();
//        for(int i=0;i<n;i++){
//            System.out.println(str.charAt(i));
//        }
        for(int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
              String  sub=str.substring(i, j);
                System.out.println(sub);
            }
//            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       substring(str);
    }
}
