package se.iths;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.Ignore;

public class MeasureConverterTest {

	MeasureConverter mc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mc = new MeasureConverter();
	}

	@After
	public void tearDown() throws Exception {
		mc = null;
	}

	// 10 pound borde bli 4[,54] kg blir 3
	@Test
	public final void testConvertWeight1() {
		assertEquals(4, mc.convertWeight(10, true));
	}
	
	// 10 kg borde bli 22[.05] pounds blir 27
	@Test
	public final void testConvertWeight2() {
		assertEquals(22, mc.convertWeight(10, false));
	}
	
	// 3 pund blir 2
	@Test
	public final void testConvertWeightToSameWeight() {
		assertEquals(3, mc.convertWeight(mc.convertWeight(3, false), true));
	}

	@Test
	public final void testConvertToFeet1() {
		//fail("Not yet implemented"); // TODO
		assertEquals(3, mc.convertToFeet(100));
	}

	@Test
	public final void testConvertToFeet2() {
		//fail("Not yet implemented"); // TODO
		assertEquals(0, mc.convertToFeet(10));
	}

	@Test
	public final void testConvertToFeet3() {
		//fail("Not yet implemented"); // TODO
		assertEquals(-3, mc.convertToFeet(-100));
	}

}
