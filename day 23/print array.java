/*
Need to write a program print the array as given input.

Input Format

The first line contains an integer n, representing the number of elements in the array.

The second line contains n space-separated integers.

Constraints

1 <= n <= 20

Output Format

Print all the array elements in a single line separated by spaces.

Sample Input 0

5
9 8 6 5 7
Sample Output 0

9 8 6 5 7
 */

 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ip.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }