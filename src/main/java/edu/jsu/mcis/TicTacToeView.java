package edu.jsu.mcis;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class TicTacToeView extends JPanel implements ActionListener{
	
	public TicTacToeView(){
		super();
	}
	
	private TicTacToeModel model;
	
	private JFrame window;
	private JButton squares[][];
	private JPanel squaresPanel;
	private JLabel resultLabel;
	private String letter;
	private String message;
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
	}

    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;

        
    }
	
    public void viewModel() {
		
		//the GUI
		
		//create the buttons
	
		//create a JPanel
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
	
	public void actionPerformed(ActionEvent e){
		//caculate who's turn it is
		if (model.isXTurn()){
			letter = "X";
		}
		else{
			letter = "O";
		} 
			
	}
	
}