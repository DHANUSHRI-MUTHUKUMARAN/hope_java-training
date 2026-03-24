import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// max number of *
        for(int i=0;i<=n;i++) // controls the rows
        {
            for(int j=i+1;j<=n;j++) // controls the no. of stars in each row
            {
                System.out.print("*");
            }
            System.out.println();
        }
sc.close();
    }
}
/*
output
*****
****
***
**
*
    */