package edu.balboa.apcs.MineSweeper.tests;

import edu.balboa.apcs.MineSweeper.*;

public class SquareTester {
	public static void runTests(MineSweeperTester t) {

		String desc; // description of current test

		///////////////////////////////////////////////////////////////////////
		// TEST 1: default square should not have a mine
		// tests hasMine()
		///////////////////////////////////////////////////////////////////////
		desc = "default square has no mine";
		try {
			Square sq1 = new Square();
			if (sq1.hasMine() == false) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 1

		///////////////////////////////////////////////////////////////////////
		// TEST 2: setting mine in newborn Square should change
		// mine status to true
		// tests plantMine()
		///////////////////////////////////////////////////////////////////////
		desc = "Planting a mine changes the state";
		try {
			Square sq1 = new Square();
			sq1.plantMine();
			if (sq1.hasMine()) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 2

		///////////////////////////////////////////////////////////////////////
		// TEST 3: default square should not be flagged
		// tests isFlagged()
		///////////////////////////////////////////////////////////////////////
		desc = "Default square has no flag";
		try {
			Square sq1 = new Square();
			if (sq1.isFlagged()) {
				t.fail(desc);
			} else {
				t.pass(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 3

		///////////////////////////////////////////////////////////////////////
		// TEST 4: Previously flagged squares should be flagged
		// tests isFlagged() with a flag
		///////////////////////////////////////////////////////////////////////
		desc = "Flagged square has flag";
		try {
			Square sq1 = new Square();
			sq1.setFlags(true);
			if (sq1.isFlagged()) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 4

		///////////////////////////////////////////////////////////////////////
		// TEST 5: Default Squares shouldnt be Inspected
		// tests isInspected()
		///////////////////////////////////////////////////////////////////////
		desc = "Default square returns false";
		try {
			Square sq1 = new Square();
			sq1.setInspected(false);
			if (sq1.isInspected()) {
				t.fail(desc);
			} else {
				t.pass(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 5

		// /////////////////////////////////////////////////////////////////////
		// TEST 6: inspected squares should be inspected
		// tests isInspected() after inspection
		// /////////////////////////////////////////////////////////////////////
		desc = "Inspected squares has return true";
		try {
			Square sq1 = new Square();
			sq1.setInspected(true);
			if (sq1.isInspected()) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 6

		///////////////////////////////////////////////////////////////////////
		// TEST 7: checks if toString returns proper string
		// tests default toString()
		///////////////////////////////////////////////////////////////////////
		desc = "default square has string \" \"";
		try {
			Square sq1 = new Square();
			if (sq1.toString() == " ") {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 7
		
		///////////////////////////////////////////////////////////////////////
		// TEST 8: checks if toString returns proper string
		// tests toString() with mine 
		///////////////////////////////////////////////////////////////////////
		desc = "Square with mine has string \"*\"";
		try {
			Square sq1 = new Square();
			sq1.plantMine();
			sq1.setInspected(true);
			if (sq1.toString() == "*") {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 8
		
		///////////////////////////////////////////////////////////////////////
		// TEST 9: checks if toString returns proper string
		// tests toString() with flag
		///////////////////////////////////////////////////////////////////////
		desc = "flagged square has string \"!\"";
		try {
			Square sq1 = new Square();
			sq1.setFlags(true);
			if (sq1.toString() == "!") {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 9
	}
}
