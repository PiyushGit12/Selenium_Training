package Test;

import org.junit.Test;

public class Exception_handling {
	
	
	@Test(expected=Exception.class)
	public void test() {
		int a=10;
		int b= 0;
		int c;
		c=a/b;
		System.out.println(c);
		
		
	}

}
