import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    String asterick = "*";
    Integer num_col = 5;
    for (int row = 1; row <= 5; row++) {
     
      for (int column = num_col; column > 0; column--) {
        System.out.print(asterick);
      }
      num_col--;
      System.out.println();
    }
  }
}
