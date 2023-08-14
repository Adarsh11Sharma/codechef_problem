/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int R = sc.nextInt();

            int extra = R / 30;

            int total = X + extra;
//
            double Plates = total / Y;
            int rem = total % Y;
            if (rem == 0) {
                System.out.println(Plates);
            } else {
                System.out.println(Plates + 1);
            }
        }
    }}
