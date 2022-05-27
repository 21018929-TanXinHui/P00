import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	//initialize a and b as an int
	int a, b, c;
	Calculator cal = new Calculator();

		@Before
	public void setUp() throws Exception {
		//initialize so no nid repeat 
		a = 4321; 
		b = 1234;
		c = 0;
		Calculator cal = new Calculator();
	}

	@Test
	public void testadd() {
		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testsubtract() {
		int actual = cal.subtract(a, b);
		int expected = 3087;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testmultiply() {
		int actual = cal.multiply(a, b);
		int expected = 5332114;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testdivide() {
		int actual = cal.divide(a, b);
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivideWith0Denominator() {
		
		try { 
			Calculator cal = new Calculator();
			cal.divide(a, c);
			fail("Expected an isit tIllegalArgumentException to be thrown");
		}
		catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
		}
		catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}

	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	
	@After
	public void tearDown() throws Exception {
		//like after testing then make a and b back to default number
		a = 0;
		b = 0;
	}
	
}
