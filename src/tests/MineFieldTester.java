package edu.balboa.apcs.MineSweeper.tests;

import edu.balboa.apcs.MineSweeper.*;

public class MineFieldTester {

	public static void runTests(MineSweeperTester t) {
		String desc;

		///////////////////////////////////////////////////////////////////////
		// TEST 1: While receiving 'e' from controller
		// tests difficulty()
		///////////////////////////////////////////////////////////////////////
		desc = "'e' sets size to 8";
		try {
			MineField mf1 = new MineField();
			mf1.difficulty('e');
			if (mf1.getSize() == 8) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 1

		///////////////////////////////////////////////////////////////////////
		// TEST 2: While receiving 'm' from controller
		// tests difficulty()
		///////////////////////////////////////////////////////////////////////

		desc = "'m' sets size to 12";
		try {
			MineField mf1 = new MineField();
			mf1.difficulty('m');
			if (mf1.getSize() == 12) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 2

		///////////////////////////////////////////////////////////////////////
		// TEST 3: While receiving 'h' from controller
		// tests difficulty()
		///////////////////////////////////////////////////////////////////////

		desc = "'h' sets size to 15";
		try {
			MineField mf1 = new MineField();
			mf1.difficulty('h');
			if (mf1.getSize() == 15) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 3

		///////////////////////////////////////////////////////////////////////
		// TEST 4: Checks if GetMinesAround returns correct numbers
		// tests getMinesAround()
		///////////////////////////////////////////////////////////////////////

		desc = "returns 1 mine around";
		try {
			MineField mf1 = new MineField();
			mf1.setTestMines("a1");
			if (mf1.getMineAround("a2") == 1) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 4

		///////////////////////////////////////////////////////////////////////
		// TEST 5: Checks if GetMinesAround returns correct numbers
		// tests getMinesAround()
		///////////////////////////////////////////////////////////////////////

		desc = "returns 2 mine around";
		try {
			MineField mf1 = new MineField();
			mf1.setTestMines("a1");
			mf1.setTestMines("a2");
			if (mf1.getMineAround("b2") == 2) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 5

		///////////////////////////////////////////////////////////////////////
		// TEST 6: Checks if GetMinesAround returns correct numbers
		// tests getMinesAround()
		///////////////////////////////////////////////////////////////////////

		desc = "returns 3 mine around";
		try {
			MineField mf1 = new MineField();
			mf1.setTestMines("a1");
			mf1.setTestMines("a2");
			mf1.setTestMines("a3");
			if (mf1.getMineAround("b2") == 3) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 6

		///////////////////////////////////////////////////////////////////////
		// TEST 7: Checks if GetMinesAround returns correct numbers
		// tests getMinesAround()
		///////////////////////////////////////////////////////////////////////

		desc = "returns 4 mine around";
		try {
			MineField mf1 = new MineField();
			mf1.setTestMines("a1");
			mf1.setTestMines("a2");
			mf1.setTestMines("a3");
			mf1.setTestMines("b1");
			if (mf1.getMineAround("b2") == 4) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 7

		///////////////////////////////////////////////////////////////////////
		// TEST 8: Checks if GetMinesAround returns correct numbers
		// tests getMinesAround()
		///////////////////////////////////////////////////////////////////////

		desc = "returns 5 mine around";
		try {
			MineField mf1 = new MineField();
			mf1.setTestMines("a1");
			mf1.setTestMines("a2");
			mf1.setTestMines("a3");
			mf1.setTestMines("b1");
			mf1.setTestMines("b3");
			if (mf1.getMineAround("a2") == 5) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 8

		///////////////////////////////////////////////////////////////////////
		// TEST 9: Checks if GetMinesAround returns correct numbers
		// tests getMinesAround()
		///////////////////////////////////////////////////////////////////////

		desc = "returns 6 mine around";
		try {
			MineField mf1 = new MineField();
			mf1.setTestMines("a1");
			mf1.setTestMines("a2");
			mf1.setTestMines("a3");
			mf1.setTestMines("b1");
			mf1.setTestMines("b3");
			mf1.setTestMines("c1");
			if (mf1.getMineAround("b2") == 6) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 9

		///////////////////////////////////////////////////////////////////////
		// TEST 10: Checks if GetMinesAround returns correct numbers
		// tests getMinesAround()
		///////////////////////////////////////////////////////////////////////

		desc = "returns 7 mine around";
		try {
			MineField mf1 = new MineField();
			mf1.setTestMines("a1");
			mf1.setTestMines("a2");
			mf1.setTestMines("a3");
			mf1.setTestMines("b1");
			mf1.setTestMines("b3");
			mf1.setTestMines("c1");
			mf1.setTestMines("c2");
			if (mf1.getMineAround("b2") == 7) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 10

		///////////////////////////////////////////////////////////////////////
		// TEST 11: Checks if GetMinesAround returns correct numbers
		// tests getMinesAround()
		///////////////////////////////////////////////////////////////////////

		desc = "returns 8 mine around";
		try {
			MineField mf1 = new MineField();
			mf1.setTestMines("a1");
			mf1.setTestMines("a2");
			mf1.setTestMines("a3");
			mf1.setTestMines("b1");
			mf1.setTestMines("b3");
			mf1.setTestMines("c1");
			mf1.setTestMines("c2");
			mf1.setTestMines("c3");
			if (mf1.getMineAround("b2") == 8) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}

		// END TEST 11

		///////////////////////////////////////////////////////////////////////
		// TEST 12: Checks if GetMinesAround returns correct numbers
		// tests getMinesAround()
		///////////////////////////////////////////////////////////////////////

		desc = "returns 0 mine around";
		try {
			MineField mf1 = new MineField();
			if (mf1.getMineAround("b2") == 0) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 12
		
		///////////////////////////////////////////////////////////////////////
		// TEST 13: Checks if inspected squares are marked
		// tests inspect()
		///////////////////////////////////////////////////////////////////////

		desc = "X is printed when inspecting an empty square";
		try {
			Square s1 = new Square();
			s1.setInspected(true);
			if (s1.toString() == "X") {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 13
		
		///////////////////////////////////////////////////////////////////////
		// TEST 13: Checks if inspected squares are marked
		// tests inspect()
		///////////////////////////////////////////////////////////////////////

		desc = "! is printed when flagging";
		try {
			Square s1 = new Square();
			s1.setFlags(true);
			if (s1.toString() == "!") {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) {
			t.fail(desc + " -- " + e);
		}
		// END TEST 13
		
		

	}

}
