package edu.balboa.apcs.MineSweeper;

/**
 * This class creates the mine, flag, and checks the square in minesweeper.
 * 
 * @author MineSweeperD
 * 
 */
public class Square {

	private boolean minePresent;

	// for blocks that have been flagged
	private boolean squareFlagged;

	// check to see if the mines are around the area where it has been clicked
	// on
	private boolean squareInspected;

	// TRYING THINGS CAN IGNORE
	private int number = 0;

	/**
	 * Checks to see if the square has a number.
	 * 
	 * @return if the square has a number then its true, if not then false.
	 */
	public boolean hasNumber() {

		if (number > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Sets the number on the square.
	 * 
	 * @param i
	 *            desired number state.
	 */
	public void setNumber(int i) {
		number = i;
	}

	/**
	 * Gets the number on the square.
	 * 
	 * @return number on square.
	 */
	public int getNumber() {
		return number;
	}

	// USING THE SPACE ABOVE

	/**
	 * This is an constructor that sets the default square to have no mines.
	 */
	public Square() {
		minePresent = false; // default square has no mine
	}

	/**
	 * Checks to see if the square has mines.
	 * 
	 * @return if the square has a mine then it turns to true, if not then
	 *         false.
	 */
	public boolean hasMine() {
		return minePresent;
	}

	/**
	 * Plants the mine on the square.
	 */
	public void plantMine() {
		minePresent = true;
	}

	/**
	 * Shows mine, flag or nothing at all on the square.
	 */
	// either show mine, flag or nothing at all
	public String toString() {
		String a = "";

		if (minePresent && squareInspected) {
			a = "*";
		} else if (squareInspected == true && hasNumber() == true) {
			for (int i = 1; i <= 8; i++) {
				if (number == i) {
					a = i + "";
				}
			}
		} else if (squareFlagged) {
			a = "!";
		} else if (squareInspected == true) {
			a = "X";
		} else {
			a = " ";
		}
		return a;
	}

	/**
	 * Checks to see if the square has been flagged.
	 * 
	 * @return if the square has been flagged then it turns true, if not then
	 *         false.
	 */
	// check to see if the block has been flagged
	public boolean isFlagged() {

		return squareFlagged;

	}

	/**
	 * Changed the state of the square to a flag.
	 * 
	 * @param b
	 *            desired flag state
	 */
	// sets the flag
	public void setFlags(boolean b) {

		squareFlagged = b;
	}

	/**
	 * Checks if a square has already been inspected.
	 * 
	 * @return if the square is inspected it turns true, if not then false.
	 */
	// check to see if it has already been clicked or flagged
	public boolean isInspected() {

		return squareInspected;
	}

	/**
	 * Changes the state of a square to and from inspected.
	 * 
	 * @param c
	 *            desired Inspected state.
	 */
	public void setInspected(boolean c) {

		squareInspected = c;
	}

}
