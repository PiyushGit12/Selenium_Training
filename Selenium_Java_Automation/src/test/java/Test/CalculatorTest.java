package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator calc=new Calculator();
	

  @Test
  public void addTest() {
	  Assert.assertEquals(20, calc.add(5, 15));
    
  }

  @Test
  public void subTest() {
	  Assert.assertEquals(10, calc.sub(15, 5));
    
  }
}
