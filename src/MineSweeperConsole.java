package edu.balboa.apcs.MineSweeper;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class provides a very simple GUI that may *optionally* 
 * be used instead of the command-line interface.
 * 
 * @author mferraro
 */
public class MineSweeperConsole extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static JFrame frame;
	private static JTextField commandField;
	private static JTextArea textArea;
	private static JButton cmdButton;
	private static int rows = 25, cols = 50;
	
	public static void setTextArea(String s) {
		textArea.replaceRange(s,0,textArea.getText().length());
	}

	public void actionPerformed(ActionEvent e) {
        //"Go" button has been clicked
		System.out.println("The command is:");
		System.out.println(commandField.getText().trim());
    }
	
	public static void main(String[] args) {
		frame = new JFrame("Minesweeper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel(new BorderLayout(5,5));
		
		textArea = new JTextArea("About to run Minesweeper!",rows,cols);
		textArea.setFont( new Font("Monospaced",Font.PLAIN,16) );
		contentPane.add(textArea, BorderLayout.NORTH);
		
		JPanel controlPane = new JPanel(new BorderLayout(5,5));
		controlPane.add(new JLabel(" Command:"), BorderLayout.WEST);
		commandField = new JTextField(10);
		controlPane.add(commandField, BorderLayout.CENTER);
		cmdButton = new JButton("Go");
		cmdButton.setMnemonic(KeyEvent.VK_G);
		cmdButton.addActionListener(new MineSweeperConsole());

		controlPane.add(cmdButton, BorderLayout.EAST);
		
		contentPane.add(controlPane, BorderLayout.SOUTH);
		
		frame.setContentPane( contentPane );
		frame.pack();
		frame.setVisible(true);
		
		try { //wait 1000ms (1sec)
			Thread.sleep(1000);
		} catch (Exception e) { 
		}
		setTextArea("changed the text...");
		
		try { //wait 1000ms (1sec)
			Thread.sleep(1000);
		} catch (Exception e) { 
		}
		setTextArea("Longer!\nLonger!\nLonger!\nLonger!\nLonger!\n");
	}
	
}
	
	
	
	
