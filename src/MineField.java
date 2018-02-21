package edu.balboa.apcs.MineSweeper;
/**
 * This class creates the grid and methods used to change the grid.
 * 
 * @author MineSweeperD
 *
 */

public class MineField {

	// size of the mine field
	private int size = 8;

	// to calculate the amount of mines in a grid
	private static double NUM_MINES = .16;

	private int col;
	private int row;

	String letter = "abcdefghijklmno";
	String number = "123456789";

	Square s1 = new Square();
	Square s2 = new Square();
	Square s4 = new Square();
	Square s5 = new Square();
	Square s6 = new Square();
	Square s7 = new Square();
	
	Square[][] mineField = new Square[15][15];

	/**
	 * Fills the MineField Array with square objects.
	 */
	public void setSquare() {
		for (int i = 0; i < mineField.length; i++) {
			for (int a = 0; a < mineField.length; a++) {
				mineField[i][a] = s2;
			}
		}
	}
	
	/**
	 * Sets the selected difficulty with the correct board size.
	 * @param a char representing the difficulty level
	 * @return the size of the array
	 */
	public int difficulty(char a) {
		if (a == 'e') {
			size = 8;
		} else if (a == 'm') {
			size = 12;
		} else if (a == 'h') {
			size = 15;
		}
		return size;
	}

	/**
	 * Translates the parameter value into a value for the column for the 2D
	 * Array.
	 * 
	 * @param String
	 *            representation of location on grid
	 * @return 2D array location
	 */
	public int getCol(String i) {
		if (i.length() == 3) {
			if (i.charAt(2) == 0) {
				col = 9;
			} else if (i.charAt(2) == '1') {
				col = 10;
			} else if (i.charAt(2) == '2') {
				col = 11;
			} else if (i.charAt(2) == '3') {
				col = 12;
			} else if (i.charAt(2) == '4') {
				col = 13;
			} else {
				col = 14;
			}
		} else {
			col = number.indexOf(i.charAt(1));
		}

		return col;
	}

	/**
	 * Translates the parameter value into a value for the row value in the 2D
	 * Array.
	 * 
	 * @param String
	 *            representation of location on grid
	 * @return 2D Array location
	 */
	public int getRow(String i) {

		row = letter.indexOf(i.charAt(0));
		return row;
	}

	/**
	 * Translate the 2D Array location into the user's view of the grid.
	 * 
	 * @param i
	 *            row
	 * @param a
	 *            column
	 * @return String of the location on the grid.
	 */
	public String locaToStr(int i, int a) {
		String location;

		location = letter.charAt(i) + "" + (a + 1);

		return location;
	}

	/**
	 * Inspects a square, if it hits a mine then it increase lose score by one
	 * if there are mines around it then it calls upon a method to set a number
	 * on the location, if it has no mines around it the it inspects the squares
	 * around it until it hits a number.
	 * 
	 * @param i
	 *            a string representation of the location on the mine field to
	 *            be inspected.
	 */
	

	
	public void inspect(String i) {
		Square s3 = mineField[getRow(i)][getCol(i)];
	
		if(s3.isInspected() == true) {
			return;
		}
		
		
		if (s3.hasMine() == true) {
		
			s3.setInspected(true);
			lose();
			
		} else if (getMineAround(i) > 0) {
			if(getMineAround(i) == 1) {
				Square curSq = new Square();
				mineField[getRow(i)][getCol(i)] = curSq;
				curSq.setNumber(getMineAround(i));
				curSq.setInspected(true);
			} else if (getMineAround(i) == 2) {
				Square curSq = new Square();
				mineField[getRow(i)][getCol(i)] = curSq;
				curSq.setNumber(getMineAround(i));
				curSq.setInspected(true);
			} else if(getMineAround(i) == 3) {
				Square curSq = new Square();
				mineField[getRow(i)][getCol(i)] = curSq;
				curSq.setNumber(getMineAround(i));
				curSq.setInspected(true);
			} else if(getMineAround(i) == 4) {
				Square curSq = new Square();
				mineField[getRow(i)][getCol(i)] = curSq;
				curSq.setNumber(getMineAround(i));
				curSq.setInspected(true);

			} else if(getMineAround(i) == 5) {
				Square curSq = new Square();
				mineField[getRow(i)][getCol(i)] = curSq;
				curSq.setNumber(getMineAround(i));
				curSq.setInspected(true);

			}  else if(getMineAround(i) == 6) {
				Square curSq = new Square();
				mineField[getRow(i)][getCol(i)] = curSq;
				curSq.setNumber(getMineAround(i));
				curSq.setInspected(true);

			} else if(getMineAround(i) == 7) {
				Square curSq = new Square();
				mineField[getRow(i)][getCol(i)] = curSq;
				curSq.setNumber(getMineAround(i));
				curSq.setInspected(true);

			} else {
				Square curSq = new Square();
				mineField[getRow(i)][getCol(i)] = curSq;
				curSq.setNumber(getMineAround(i));
				curSq.setInspected(true);
			}
			
			
		} else {


			for (int a = getRow(i) - 1; a <= getRow(i) + 1; a++) {
				for (int b = getCol(i) - 1; b <= getCol(i) + 1; b++) {
					if (a < size && b < size && a >= 0 && b >= 0) {
						
						if (s3.hasMine() == false && mineField[a][b] == s3) {
							// System.out.println(LocaToStr(a, b) + "<<");
							s4.setInspected(true);
							mineField[getRow(i)][getCol(i)] = s4;
							inspect(locaToStr(a,b));
							
						}
					}
				}
			}

			
		}

	}

	/**
	 * flags the square at the given location.
	 * 
	 * @param i
	 *            string representation of the location on the mine field to be
	 *            flagged
	 */
	public void flag(String i) {
		if(mineField[getRow(i)][getCol(i)].hasMine() == true){;
		mineField[getRow(i)][getCol(i)] = s5;
			s5.setFlags(true);
			s5.plantMine();
			
		}	else {
			s7 = mineField[getRow(i)][getCol(i)];
			mineField[getRow(i)][getCol(i)] = s6;
			s6.setFlags(true);
		}
		
		

	}

	/**
	 * Unflag the square at a given location if it is already flagged
	 * 
	 * @param i
	 *            a string representation of the location on the mine field to
	 *            be un-flagged
	 */
	public void unFlag(String i) {
		if(s5.isFlagged() == true) {
			mineField[getRow(i)][getCol(i)] = s1;
		} else {
			s6.setFlags(false);
			mineField[getRow(i)][getCol(i)] = s7;
		}
	}

	/**
	 * Access method for size variable
	 * 
	 * @return size variable
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Sets a mine at the specified location.
	 * @param i a string representation of the location on the mine field
	 */
	 public void setTestMines(String i) {
	
		 mineField[getRow(i)][getCol(i)] = s1;
		 s1.plantMine();
	 }

	/**
	 * Returns the number of the mines around a given point.
	 * 
	 * @param i
	 *            a string representation of the location on the mine field
	 * @return the number of mine around the location
	 */
	public int getMineAround(String i) {
		int count = 0;

		for (int a = getRow(i) - 1; a <= getRow(i) + 1; a++) {
			for (int b = getCol(i) - 1; b <= getCol(i) + 1; b++) {
				if (a < size && b < size && a >= 0 && b >= 0) {
					// System.out.println(LocaToStr(a, b));
					if (s1.hasMine() == true && mineField[a][b] == s1) {
						// System.out.println(LocaToStr(a, b) + "<<");
						count++;
					}
				}
			}
		}

		return count;
	}

	/**
	 * Sets the mine position on the grid.
	 */
	public void setMinePosition() {

		int row = (int) (Math.random() * size);
		int column = (int) (Math.random() * size);
		int numMines = (int) ((size * size) * NUM_MINES);
				
		while (numMines > 0) {
			row = (int) (Math.random() * size);
			column = (int) (Math.random() * size);
			mineField[row][column] = s1;
			if (!s1.hasMine()) {
				s1.plantMine();	
			} 

			numMines--;
			//System.out.println(numMines+ "<<");
		
		}
		// System.out.println("hello");
		int count = 0;
		for(int a = 0 ; a < size ; a++) {
			for (int b = 0 ; b < size ;b++) {
				if(mineField[a][b] == s1) {
					count++;
				}
			}
		}
		//	System.out.println(count);
	}
	
	/**
	 *  Checks if the person has lost the game.
	 */
	public boolean lose() {
	boolean death = false;
		for(int a = 0 ; a < size ; a++) {
			for (int b = 0 ; b < size ; b++) {
				if(mineField[a][b].hasMine() == true 
						&& mineField[a][b].isInspected()) {
					death = true;
				} 
			}
		}
		return death;
	}
	
	/**
	 * Checks if the person has won the game.
	 * @return a boolean, true if win, false if lose.
	 */
	public boolean win() {
		int space = 0;
		for(int a = 0 ; a < size ; a++) {
			for (int b = 0 ; b < size ; b++) {
				if(mineField[a][b].isInspected()) {
					space++;
				} else if (mineField[a][b].hasMine()) {
					space++;
				}
			}
		}
		if(space == size*size) {
		return true;
		} else {
			return false;
		}
	}

	/**
	 * Prints out the grid.
	 */
	public String toString() {
		// numbers the top?
		System.out.print("    ");
		for (int i = 0; i < size; i++) {
			if (i < 10) {
				System.out.print("  " + (i + 1) + " ");
			} else {
				System.out.print(" " + (i + 1) + " ");
			}
		}

		System.out.println();
		for (int a = 0; a < size; a++) {
			// the blank corner of the grid above letters next to numbers
			System.out.print("    ");

			// creates the top/bottoms of the boxes
			for (int i = 0; i < size; i++) {
				// System.out.print("+");
				System.out.print("+---");
			}
			System.out.print("+");

			// next row
			System.out.println();

			// letters the sides
			System.out.print(" " + letter.charAt(a) + "  ");

			// creates the sides of the boxes
			for (int i = 0; i < size; i++) {
				System.out.print("| ");
				System.out.print(mineField[a][i] + " ");
			}
			System.out.print("|");

			// next row
			System.out.println();
		}

		// makes the bottom of the last row
		System.out.print("    ");
		for (int i = 0; i < size; i++) {
			System.out.print("+---");
		}
		System.out.print("+");
		System.out.println();
		return "";
	}

}
