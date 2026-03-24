import java.util.Scanner;
public class pyramid {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // height of the pyramid
        for(int i=n;i>=0;i--) // controls the rows
        {
            for(int j=n-i;j>=0;j--) // controls the no. of spaces in each row
            {
                System.out.print(" ");
            }
                for(int k=1;k<=2*i+1;k++) // controls the no. of stars in each row
                {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
    } 
/*
 ***********
  *********
   *******
    *****
     ***
      *
*/




