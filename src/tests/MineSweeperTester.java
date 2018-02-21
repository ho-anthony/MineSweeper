package edu.balboa.apcs.MineSweeper.tests;

/**
 * This class is the test driver for MineSweeper.  When this class is run, 
 * all other classes' tests will be triggered. 
 *
 * @author mferraro
 */
public class MineSweeperTester {
	
	//keep track of test #
	private int testNum = 1;

	public void fail(String description) {
		System.out.println("(" + testNum + ")\tTEST FAILURE: " + description);
		testNum++;
	}

	public void pass(String description) {
		System.out.println("(" + testNum + ")\tTest Passed: " + description);
		testNum++;
	}
//-------------------------------------Main Under--------------------------------------------
	
	public static void main(String[] args) {
		MineSweeperTester t = new MineSweeperTester();
		
		
		//SampleSquareTester included as an example -- modify as needed!
		System.out.println("\t\t---------- Running tests on Square.java ----------\n");
		SquareTester.runTests(t);
		System.out.println("\n\t\t---------- Running tests on MineField.java ----------\n");
		MineFieldTester.runTests(t);
	}

}
