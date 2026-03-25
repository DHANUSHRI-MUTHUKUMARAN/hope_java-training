import java.util.*;
public class pattern1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // how many row in the pyramid
        for(int i=0;i<n;i++) // controls the rows
        {
            for(int j=0;j<i+1;j++) // controls the no. of stars in each row
            {
                System.out.print("*");// prints the * in the same line
            }
            System.out.println();// new line
        }
sc.close();
    }
}

/*
output
*
**
***
****
*****
*/