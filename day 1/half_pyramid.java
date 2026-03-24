import java.util.*;
public class half_pyramid {
    public static void main(String[] args) {
        int n = 5; // no. of starts in the middle row
        for (int i = 1; i <= n; i++) { // controls the rows till first half of the pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // prints the * in the same line
            }
            System.out.println(); // new line 
        }

        for (int i = n - 1; i >= 1; i--) { // controls the rows from the next half of the pyramid after the middle row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");// prints the * in the same line
            }
            System.out.println(); // new line
        }
    }
}


/* output
*
**
***
****
*****
****
***
**
*
 */