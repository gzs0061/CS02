/**
*Program that creates comparable customer interface.
*
*@author Ella Seaman - CPSC-1220
*@version 08/25/2021
*/
 
 
public class Customer {  
   //instance variables
   private String name;
   private String location;
   private double balance;  
   
   /**
   * constructor.
   *  
   * @param nameIn - brings name string
   * 
   *
   */
   public Customer(String nameIn) {
   
      this.name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
   * sets location.
   * @param locationIn string
   */
   public void setLocation(String locationIn) {
   // sets location variable
      location = locationIn;
   }
   
   /**
   * sets location.
   * @param city string
   * @param state string
   */
   public void setLocation(String city, String state) {
   // sets location variable
      location = city + ", " + state;  
   }
   
   /**
   * changes balance.
   * @param amount double
   */
   public void changeBalance(double amount) {
   // add amount to balance
      balance += amount;
   }
   
   /**
   * gets location.
   * @return location
   */
   public String getLocation() {
   // returns variable for location
      return location;
   }
   
   /**
   * gets balance.
   * @return balance double
   */
   public double getBalance() {
   // returns variable for balance
      return balance;
   }
   
   /**
   * string summary.
   * @return output
   */
   public String toString() {
      return name + "\n" + location + "\n" + "$" + balance;
   }
   
  /**
  * compares customer balance.
  * @param obj Customer objects
  * @return returns comparison
  */
   
   public int compareTo(Customer obj) {
      
      if (this.balance > obj.getBalance()) {
         return 1;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 0;
      }
   
   }
   
   
}
   
