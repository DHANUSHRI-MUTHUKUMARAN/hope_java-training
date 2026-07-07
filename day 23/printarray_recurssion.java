import java.io.*;
import java.util.*;

public class Solution {
    public static void display(int[] arr,int i){
        if(i>arr.length-1){
            return;
        }
        System.out.print(arr[i]+" ");
        display(arr,i+1);
        //return arr[i];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ip.nextInt();
        }
        /*for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/
        display(arr,0);
        
    }
}