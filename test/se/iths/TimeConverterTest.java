/**
 * 
 */
package se.iths;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author zzammypanda
 *
 */
public class TimeConverterTest {

	TimeConverter tc;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tc = new TimeConverter();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tc = null;
	}

	/**
	 * Test method for {@link se.iths.TimeConverter#getMeridiem(int)}.
	 */
	@Test
	public final void testGetMeridiemMidnight1() {
		assertEquals("AM", tc.getMeridiem(0));
	}
	
	/**
	 * Test method for {@link se.iths.TimeConverter#getMeridiem(int)}.
	 */
	@Test
	public final void testGetMeridiemTimeConverterVormittag() {
		assertEquals("AM", tc.getMeridiem(11));
	}
	/**
	 * Test method for {@link se.iths.TimeConverter#getMeridiem(int)}.
	 */
	@Test
	public final void testGetMeridiemNachmittag() {
		assertEquals("PM", tc.getMeridiem(12));
	}
	
	/**
	 * Test method for {@link se.iths.TimeConverter#getMeridiem(int)}.
	 */
	@Test
	public final void testGetMeridiemMidnight2() {
		assertEquals("PM", tc.getMeridiem(23));
	}

	/**
	 * Test method for {@link se.iths.TimeConverter#getMeridiem(int)}.
	 */
	@Test (expected = IllegalArgumentException.class)
	public final void testGetMeridiemYesterday() throws IllegalArgumentException{
		assertEquals("AM", tc.getMeridiem(-1));
	}

	/**
	 * Test method for {@link se.iths.TimeConverter#getMeridiem(int)}.
	 */
	@Test (expected = IllegalArgumentException.class)
	public final void testGetMeridiemTomorrow() throws IllegalArgumentException{
		assertEquals("AM", tc.getMeridiem(24));
	}
}
