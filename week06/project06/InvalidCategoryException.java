/**
*Program that holds online data.
*
*@author Ella Seaman - CPSC-1220
*@version 09/25/2021
*/



public class InvalidCategoryException extends Exception {

   /**
   * Defines what the invalid category exception is. 
   *
   *@param categoryIn which is the wrong char of line of the file.
   */
   public InvalidCategoryException(String categoryIn) {
      
      super("For category: " + "\"" + categoryIn + "\"");
   }
      
}