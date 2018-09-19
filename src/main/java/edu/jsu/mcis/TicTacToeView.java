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
	private JPanel squaresPanel = new JPanel(new gridLayout(model.getWidth(),model.getWidth()));
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
		window = new JFrame("Tic-Tac-Toe");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(300,300);
		window.getContentPane().add(new TicTacToeView());
		window.setVisible(true);
		
		//create the buttons
	
		
		for (int row = 0; row < model.getWidth(); row++){
			for (int col = 0; col < model.getWidth(); col++){
				squares = new JButton[model.getWidth()][model.getWidth()];
				squares[row][col].addActionListener(this);
				squares[row][col].setName("Square" + row + col);
				squaresPanel.add(squares[row][col]);
			}
		}
		
		
		add(squaresPanel);
		
		//create a JPanel		
		resultLabel = new JLabel("");
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