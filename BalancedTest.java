package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BalancedTest {
	Balanced balanced=null;
	@Before
public void setup()
{
		balanced=new Balanced();
}
	@Test
	public void test() {
		boolean result=balanced.balancedParanthesis("{[(a+(a*b))]}");
		assertEquals(false,result);
	
	}

}
