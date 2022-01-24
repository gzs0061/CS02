/**
*Program that holds online inventory and extends online text item.
*
*@author Ella Seaman - CPSC-1220
*@version 09/08/2021
*/
 
public class OnlineBook extends OnlineTextItem { 
   //instance variables
   protected String author;
   
   /**
   * constructor.
   *@param nameIn brings in name of object
   *@param priceIn brings in price of object
   */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
   * sets author.
   *@param authorIn sets author
   */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   
   /**
   * string that compiles author and price together.
   *@return returns author and cost
   */
   public String toString() {
      return name + " - " + author + ": $" + super.calculateCost();
   }
   
}
   
