/*
Write a program to print the elements of an array that lie between the given start index and end index (both inclusive). Assume 0-based indexing.

Input Format

The first line contains an integer n, representing the number of elements in the array.

The second line contains n space-separated integers.

The third line contains two integers L and R, representing the start and end indices.

Constraints

1 <= n <= 20 0 <= L < R < n

Output Format

Print all the elements from index L to R (both inclusive) separated by spaces.

Sample Input 0

7
2 3 1 4 9 8 7
1 4
Sample Output 0

3 1 4 9 */

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ip =new Scanner(System.in);
        int n = ip.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ip.nextInt();
        }
        int l = ip.nextInt(), r = ip.nextInt();
        for(int i=l;i<=r;i++){
            System.out.print(arr[i]+" ")
        }
    }
}