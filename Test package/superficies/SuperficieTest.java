/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dpazolopez
 */
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SuperficieTest {
   private float num1,num2;
   private float expectedResult;

   

   @Before
   public void initialize() {
      
   }

   
   public SuperficieTest(float num1, float num2, float expectedResult) {
     this.num1=num1;
     this.num2=num2;
     this.expectedResult=expectedResult;
   }

   @Parameterized.Parameters
   public static Collection SuperficieTest() {
      return Arrays.asList(new Object[][] {
         { 2, 2, 2 },
         { 6, 2, 6 },
         { 9, 2, 9 },
         { 2, 2, 2 },
         { 3, 6, 9 }
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testcalcuTrian() {
      System.out.println("Parameterized Number is : " + num1);
      assertEquals(expectedResult, Superficie.calcuTrian(num1,num2),0);
   }
}