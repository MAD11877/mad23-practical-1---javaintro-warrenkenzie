import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
    Scanner in = new Scanner(System.in);
    Integer input = in.nextInt();
    ArrayList<Integer> data = new ArrayList<>();

    /*dictionary */
    ArrayList<Integer> key = new ArrayList<>(); 
    ArrayList<Integer> value = new ArrayList<>(); 

    int highest_freq = -1;
    if(input != 0){
      while(input>0){
        Scanner inputs = new Scanner(System.in);
        data.add(inputs.nextInt());
        input--;
      }

      for(int i:data){
        if (!key.contains(i)){
          key.add(i);
          value.add(1);
        }
        else{ 
          value.set(key.indexOf(Integer.valueOf(i)), value.get(key.indexOf(Integer.valueOf(i))) + 1);
        }
      }
  
      for(int i:value)
      {
        if (highest_freq == -1){
          highest_freq = i; 
        }
        else{
          if (highest_freq < i){
            highest_freq = i;
          }
        }
      }    
      System.out.println(key.get(value.indexOf(highest_freq)));
    }
    else{
      System.out.println(0);
    }
    

  }
}
