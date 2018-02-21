package edu.balboa.apcs.MineSweeper;

/**
 * This class is provided to help students understand the 
 * tester setup for this application and should not be used
 * as part of the final MineSweeper application.
 * 
 * @author mferraro
 */
public class SampleSquare {

	private boolean minePresent;

	public SampleSquare() {
		minePresent = false; //default square has no mine
	}
	
	public boolean hasMine() {
		return minePresent;
	}
	
	public void plantMine() {
		minePresent = false; //INTENTIONALLY BROKEN!
	}

}
