/*
Alice and Bob are batch mates and Alice got placed in a well-reputed product-based company and his friend Bob is demanding a pizza party from him. Alice is ready for giving party and he ordered N pizzas from the nearest restaurant. Now pizzas can have at most K different flavors (It is not necessary that there should be one pizza of each flavor), numbered from 1 to K such that ⅈ^th pizza can have Ai flavor (1 <= Ai <=k). Bob is on dieting, and he can only eat pizza of at most k-1 flavors but he can eat as many pizzas of ith flavor and he wanted to choose maximum possible pizzas which are in contiguous sequence to one another such that all pizzas in sequence has atmost k-1 flavors.

The Input format for testing The candidate has to write the code to accept 2 inputs. First Input: It will contain two integer N and K Second Input: It will contain a N integer separated by space.

Instructions: System doesn't allow any kind of hard coded input value/values. Written program code by the candidate will be verified against the inputs which are supplied from the system

Input Format

The candidate has to write the code to accept 2 inputs. First Input: It will contain two integer N and K Second Input: It will contain a N integer separated by space.

Constraints

1Size of Array 2 Number of different flavors 1 Value of ith flavor 0 base indexing

Output Format

The output will contain a single line containing an integer denoting maximum possible length of subarray.

Additional messages in output will cause the failure of test cases.

Sample Input 0

6 2
1 1 1 2 2 1
Sample Output 0

3
Explanation 0

Maximum length subarray with at most k-1 distinct flavors is 3 and sub array is 1 1 1

Sample Input 1

5 3
1 1 2 2 1
Sample Output 1

5
Explanation 1

Since N pizza in total has only 2 flavors so bob can eat all pizza so maximum length of subarray with at most k-1 distinct flavors is 5 */

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ip.nextInt();
        }
        int max=0,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k-1){
                count++;
                max = Math.max(count,max);
            }
            else
                count=0;
        }
        System.out.print(max);
    }
    
    
}