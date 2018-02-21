package edu.balboa.apcs.MineSweeper.tests;

import edu.balboa.apcs.MineSweeper.*;

/**
 * This class tests the SampleSquare class' methods.
 * 
 * @author mferraro
 */
public class SampleSquareTester {

	public static void runTests(MineSweeperTester t) {

		String desc; //description of current test

		///////////////////////////////////////////////////////////////////////
		// TEST 1:  default square should not have a mine
		///////////////////////////////////////////////////////////////////////
		desc = "default square has no mine";
		try {
			SampleSquare sq1 = new SampleSquare();
			if ( sq1.hasMine() == false ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 1 
		
		
		///////////////////////////////////////////////////////////////////////
		// TEST 2:  setting mine in newborn Square should change
		//          mine status to true
		///////////////////////////////////////////////////////////////////////
		desc = "setting a mine changes the state";
		try {
			SampleSquare sq1 = new SampleSquare();
			sq1.plantMine();
			if ( sq1.hasMine() ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 2
		


	}


}
