import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
*Test for personal cloud.
*/

public class PersonalCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** tests get and sets. **/
   @Test public void getAndSetTest() {
      PersonalCloud c2 = new PersonalCloud("Cloud Two", 9.00, 12.0, 20.0);
      PersonalCloud c3 = new PersonalCloud("Cloud Three", 9.00, 25.0, 20.0);
      
      c2.setName("Cloud");
      Assert.assertEquals("Cloud", c2.getName());
      
      c2.setBaseStorageCost(9.00);
      Assert.assertEquals(9.00, c2.getBaseStorageCost(), .0);
      
      
      c2.setDataStored(12.00);
      Assert.assertEquals(12.00, c2.getDataStored(), 12.0);
      
      c2.setDataLimit(20.00);
      Assert.assertEquals(20.00, c2.getDataLimit(), 20.0);
      
      c2.getCostFactor();
      Assert.assertEquals(1.0, c2.getCostFactor(), 3.0);
   
   }
    
   /** tests data overage true. **/
   @Test public void dataOverageTest() {
      PersonalCloud c2 = new PersonalCloud("Cloud Two", 9.00, 12.0, 20.0);
      c2.dataOverage();
      Assert.assertEquals(0.0, c2.getCostFactor(), 3.0);
   }
    
     /** tests monthly cost. **/
   @Test public void monthlyCostTest() {
      PersonalCloud c2 = new PersonalCloud("Cloud Two", 9.00, 12.0, 20.0);
      PersonalCloud c3 = new PersonalCloud("Cloud Three", 9.00, 25.0, 20.0);
      
      c2.monthlyCost();
      Assert.assertEquals(9.0, c2.monthlyCost(), 0.0);
      
      c3.monthlyCost();
      Assert.assertEquals(24.0, c3.monthlyCost(), 0.0);
   
   }
}
