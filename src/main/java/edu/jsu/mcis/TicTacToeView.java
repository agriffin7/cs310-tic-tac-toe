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
		
		JPanel squaresPanel = new JPanel(new GridLayout(model.getWidth(), model.getWidth()));
		
		//create the buttons
		JButton squares[][] = new JButton[model.getWidth()][model.getWidth()];
		for (int row = 0; row < model.getWidth(); row++){
			for (int col = 0; col < model.getWidth(); col++){
				squares[row][col] = new JButton();
				//squares[row][col].addActionListener(this);
				squares[row][col].setName("Square" + row + col);
				squaresPanel.add(squares[row][col]);
			}
		}
		window.add(squaresPanel);
		
		JLabel resultLabel = new JLabel();
		resultLabel.setName("ResultLabel");
		
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