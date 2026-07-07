import java.io.*;
import java.util.*;

public class Solution {
    /*static void display(int[] arr,int l,int r){
        if(l==r+1) return;
        System.out.print(arr[l]+" ");
        display(arr, l+1, r);
    }*/

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ip =new Scanner(System.in);
        int n = ip.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ip.nextInt();
        }
        int l = ip.nextInt(), r = ip.nextInt();
        //display(arr, l, r);
        for(int i=l;i<=r;i++){
            System.out.print(arr[i]+" ")
        }
    }
}