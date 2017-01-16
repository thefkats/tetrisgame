package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import tetrisgame.Generator;

/**
 * Tests the generator class for functionality.
 * @author James Fkat
 *
 */
public class GeneratorTests {
	
	@Before
	public void setup() {
		Generator gen = new Generator(13);
		String msg;
	}
	
	@Test
	public void test1() {
		String actual;
		String expected;
		assertEquals("1","1","hi");
	}
}
