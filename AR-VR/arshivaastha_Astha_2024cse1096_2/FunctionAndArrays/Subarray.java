import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner in = new Scanner ( System.in);
    
    int n = in.nextInt();
    
    int[] a =new int[n];
    for(int i = 0;i<a.length; i++)
    {
        a[i]=in.nextInt();
    }
    for(int i =0;i<a.length;i++)
    {
        for(int j =i; j<a.length;j++)
        {
            for(int k=i;k<=j;k++)
            System.out.print(a[k]+ "\t");
            System.out.println();
        }
        
    }
 }

}