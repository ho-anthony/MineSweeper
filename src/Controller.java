package edu.balboa.apcs.MineSweeper;

import java.util.Scanner;
/**
 * This class is the controller class of Minefield.
 * 
 * @author MineSweeperB
 */

public class Controller {
	private static int win;
	private static int lose;
	public static void main(String[] args) {
		boolean game = true;
		boolean choice = true;
		boolean quit = true;
		while(game) {
			MineField mf2 = new MineField(); 
			String c;
			boolean continuing = true;
			greeting();
			while(continuing) {
				c = getChoice();
				switch(c) {
					case "E":
						mf2.difficulty('e');
						continuing = false;
						choice = true;
						break;
					case "M":
						mf2.difficulty('m');
						continuing = false;
						choice = true;
						break;
					case "H":
						mf2.difficulty('h');
						continuing = false;
						choice = true;
						break;
					case "Q":				
						game = false;
						continuing = false;
						choice = false;
						quit = false;
						System.out.println("You have just quit.");
						break; 			  
					default:
						System.out.println("INVALID CHOICE.");
						System.out.println(" ");
						greeting();
						//continuing = false;
						break;
						
						
				}
				
			}
			while(choice) {
				mf2.setSquare();
				mf2.setMinePosition();
				mf2.toString();
				break;
			}
//			mf2.setSquare();
//			mf2.setMinePosition();
//			mf2.toString();
			boolean endGame = false;
			 
			boolean commandCheck = true;
			while(quit) {
				System.out.println("Enter Your command: ");
				Scanner playerCmd = new Scanner(System.in);
				String command = playerCmd.nextLine().trim().toUpperCase();
				
				
				char action = command.charAt(0);
//				char error1 = command.charAt(command.length()-1);
//				char error2 = command.charAt(command.length()-2);
				
				String run;
				if(action == 'Q'||action == 'q') {
					quit = false;
					commandCheck = false;
					endGame = false;
					game = false;
					System.out.println("Thank you.");
				}
				else if(commandCheck){
					String error = command.substring(1).trim();
					String error1 = error.substring(1,error.length());
					String error2 = error.charAt(0)+"";
					try {
						if (command=="") {
							System.out.println("Invalid Command!!");
						} 
					} catch (Exception e) { 
						
					}
					if(error1 == "A" || error1 == "B"|| error1 == "C"|| error1 == "D"|| error1 == "E"
							|| error1 == "F"|| error1 == "G"|| error1 == "H"|| error1 == "I"
							|| error1 == "J"|| error1 == "K"|| error1 == "L"|| error1 == "M"
							|| error1 == "N"|| error1 == "O") {
						System.out.println("Invalid Command!!");
					}else if(error2 == "0" || error2 == "1" || error2 == "2"|| error2 == "3"|| error2 == "4"
					|| error2 == "5"|| error2 == "6"|| error2 == "7"|| error2 == "8"|| error2 == "9") {
						System.out.println("Invalid Command!!");
					} if(error.length()>3) {
						System.out.println("Invalid Command!!");
					}else {
						String command1 = command.substring(1).trim();
						String row = command1.charAt(0)+"";
						String col = command1.substring(1,command1.length());
						String position = row +""+col+"";
						String position1 = position.toLowerCase();
						
						run = command.charAt(0)+"";
						
							switch (run) {
							case "I":
								mf2.inspect(position1);
								mf2.toString();
								//commandCheck = false;
								break;
							case "F":
								mf2.flag(position1);
								mf2.toString();
								//commandCheck = false;
								break;
							case "U":
								mf2.unFlag(position1);
								mf2.toString();
								//commandCheck = false;
								break;
							default:
								System.out.println("Invalid Command");	
							}
					} 
				}	
					if (mf2.lose()) {
						System.out.println("Sorry. You just lost.");
						lose++;
						endGame = true;
						quit = false;
					}
					if (mf2.win()) {
						System.out.println("Congratualtion! You just win!!");
						win++;
						endGame = true;
						quit = false;
					}
				
				
				
			}	
			while (endGame) {
				boolean PlayAgain = false;
				System.out.println("--Scoreboard--" );
				System.out.println("wins: " + win);
				System.out.println("losses: " + lose);
				System.out.println("Would you like to play again?");
				System.out.println("[Y]es");
				System.out.println("[N]o");
				Scanner newGameChoice = new Scanner(System.in);
				String newCommand = newGameChoice.next().trim().toUpperCase();
				
				if (!PlayAgain) {
					switch (newCommand) {
					case "Y":
						continuing = true;
						quit = true;
						endGame = false;
						PlayAgain = false;
						break;
					case "N":					
						endGame = false;
						game = false;
						System.out.println("GoodBye.");
						break;
					default:
						System.out.println("Invalid Command");
					}
				}
			}
		}
	}	
	/**
	 * Method to print out welcome prompt.
	 */
	public static void greeting() {
		String menu = "Welcome to APCS MineSweeper.";
		String prompt = "Please choose a difficulty ";
		prompt += "\n\n[E]asy";
		prompt += "\n[M]edium";
		prompt += "\n[H]ard";
		prompt += "\n[Q]uit";
		prompt += "\n\n";
		System.out.print(menu);
		System.out.print(prompt);
	}
	/**
	 * Method to print out player's input for choosing difficulty.
	 */
	public static String getChoice() {
		Scanner keybd = new Scanner(System.in);
		return keybd.next().trim().toUpperCase();
	}	
}
