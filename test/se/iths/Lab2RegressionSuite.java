/**
 * Runs all cases for Lab2
 */
package se.iths;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Maria Suomela
 *
 */
	
	@RunWith(Suite.class)
	@Suite.SuiteClasses({
	  MeasureConverterTest.class,
	  TimeConverterTest.class,
	  AmericanizerTest.class,
	})

	public class Lab2RegressionSuite {
	  // the class remains empty,
	  // used only as a holder for the above annotations
	}

