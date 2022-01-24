import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*Test for public cloud.
*/
public class PublicCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests gets and sets. **/
   @Test public void getAndSetTest() {
      PublicCloud c2 = new PublicCloud("Cloud Two", 9.00, 12.0, 20.0);
      PublicCloud c3 = new PublicCloud("Cloud Three", 9.00, 25.0, 20.0);
      
      c2.setName("Cloud");
      Assert.assertEquals("Cloud", c2.getName());
      
      c2.setBaseStorageCost(9.00);
      Assert.assertEquals(9.00, c2.getBaseStorageCost(), .0);
      
      
      c2.setDataStored(12.00);
      Assert.assertEquals(12.00, c2.getDataStored(), 12.0);
      
      c2.setDataLimit(20.00);
      Assert.assertEquals(20.00, c2.getDataLimit(), 20.0);
      
      c2.getCostFactor();
      Assert.assertEquals(2.0, c2.getCostFactor(), 2.0);
   
   }
    
    /** tests monthly cost. **/
   @Test public void monthlyCostTest() {
      PublicCloud c2 = new PublicCloud("Cloud Two", 9.00, 12.0, 20.0);
      PublicCloud c3 = new PublicCloud("Cloud Three", 9.00, 25.0, 20.0);
      
      c2.monthlyCost();
      Assert.assertEquals(9.0, c2.monthlyCost(), 0.0);
      
      c3.monthlyCost();
      Assert.assertEquals(19.0, c3.monthlyCost(), 0.0);
   
   }
}
