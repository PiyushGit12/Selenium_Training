package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest2 {
	
	Calculator calc_01=new Calculator();


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass Method is executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass Method is executed");
	}

	@Test
	public void testadd() {
		assertEquals(calc_01.add(10, 5),15);
			
	}
	
	@Test
	public void testsub() {
		assertEquals(calc_01.sub(20, 10),10);
	}
	
	//////////////////////////              Junit-Assertions         ////////////////////////////////////////////////////               
	
	@Test
    public void testConcatenate() {
		

        String result = calc_01.concatenate("one", "two");
        
      //Check whether two Strings are equal to each other. 
        assertEquals("onetwo", result);

    }
	@Test
	public void testAssertions()
	{
	
		String[] expectedArray = {"one", "two", "three"};
	    String[] resultArray =  {"one", "two", "four"};
	      
	    //Check whether two arrays are equal to each other.
	      assertArrayEquals(expectedArray, resultArray);
	      
	}
	@Test
	public void asserttrue() {
		
		int val1=10;
		int val2=17;
		
		assertTrue(val2>val1);
		
//			if(val2>val1)
//			{
//			System.out.println("val2 is greater than val1");
//			}
//			else {
//				System.out.println("Val1 is greater than Val2");
//			} 
						
}
	@Ignore                                             /// skip the executions of the test method &class   //////////
	public void Skip_flow() {
		assertEquals(calc_01.sub(20, 10),10);
	}
	
	
}	
	
	
	
	
	
	
