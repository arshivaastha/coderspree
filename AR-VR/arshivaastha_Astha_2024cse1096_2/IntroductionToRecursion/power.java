import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner in = new Scanner(System.in);
          int x = in.nextInt();
        int n = in.nextInt();
        int p = power(x,n);
        System.out.println(p);
    }

    public static int power(int x, int n){
        if(n==0)
       return 1;

       int f1=power(x,n-1);
       int fn= x*f1;
       return fn;
       
    }

}