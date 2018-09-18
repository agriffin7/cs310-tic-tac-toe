package edu.jsu.mcis;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class TicTacToeView extends JPanel{
	
	private TicTacToeModel model;
		
	public TicTacToeView(){
		super();
	}
	
	@Override
	protected void paintComponent(Graphics g) { //create GUI elements here
		super.paintComponent(g);
	}
	
	
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
		
		//the GUI
		JFrame window = new JFrame("Tic-Tac-Toe");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().add(new TicTacToeView());
		window.setSize(300,300);
		window.setVisible(true);
		
    }
		

    public void showNextMovePrompt() {

	
		
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        System.out.println("That is not a valid input!");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}