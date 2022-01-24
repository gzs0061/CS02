/**
*Program that holds online inventory and extends online text item.
*
*@author Ella Seaman - CPSC-1220
*@version 09/08/2021
*/
 
public class OnlineArticle extends OnlineTextItem { 
   //instance variables
   private int wordCount;
   
   /**
   * constructor.
   *@param nameIn brings in name of object
   *@param priceIn brings in price of object
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
   * sets word count.
   *@param wordCountIn sets word count
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
   
}
   
