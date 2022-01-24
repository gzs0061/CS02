/**
*Program that holds scores.
*
*@author Ella Seaman - CPSC-1220
*@version 08/31/2021
*/
 
 
public class Scores {  
   //instance variables
   private int[] numbers;  
   
   /**
   * constructor.
   *  
   * @param numbersIn sets numbers
   * 
   *
   */
   public Scores(int[] numbersIn) {
   
      numbers = numbersIn;
   }
   
   /**
   * even scores.
   * @return returns evens.
   */
   public int[] findEvens() {
   
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /**
   * odd scores.
   * @return returns odds.
   */
   public int[] findOdds() {
   
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
   * average scores.
   * @return returns average.
   */
   public double calculateAverage() {
   
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return ((double) sum / numbers.length);
   } 
   
   /**
   * checks output.
   * @return output
   */
   public String toString() {
      String output = "";
      
      for (int i = 0; i < numbers.length; i++) {
         output += numbers[i] + "\t";
      }
      return output;
      
   }
   
   /**
   * checks output.
   * @return output
   */
   public String toStringInReverse() {
      String output = "";
      
      for (int i = numbers.length - 1; i != -1; i--) {
         output += numbers[i] + "\t";
      }
      return output;
      
   }
     
   
}
   
