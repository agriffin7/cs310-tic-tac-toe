package edu.jsu.mcis;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class TicTacToeView extends JPanel implements ActionListener{
	
	private TicTacToeModel model;
	
	private JButton[][] squares;
	private JPanel squaresPanel = new JPanel(new GridLayout(model.getWidth(), model.getWidth()));;
	private JLabel resultLabel = new JLabel("");
	private String letter;
	private String message;

    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
		
		//the GUI
		JFrame window = new JFrame("Tic-Tac-Toe");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(300,300);
		window.setVisible(true);

		
		//create the buttons
		
		for (int row = 0; row < model.getWidth(); row++){
			for (int col = 0; col < model.getWidth(); col++){
				squares[row][col] = new JButton("");
				squares[row][col].setName("Square" + row + col);
			}
		}
		for (int row = 0; row < model.getWidth(); row++){
				for (int col = 0; col < model.getWidth(); col++){
					squares[row][col].addActionListener(this);
				}
			}
			for (int row = 0; row < model.getWidth(); row++){
				for (int col = 0; col < model.getWidth(); col++){
					squaresPanel.add(squares[row][col]);
			}
		}
		
		window.add(squaresPanel);
		
		//create a JPanel		
		JLabel resultLabel = new JLabel("");
		resultLabel.setName("ResultLabel");
		message = "Welcome to Tic-Tac-Toe!";
		resultLabel.setText(message);
		window.add(resultLabel, BorderLayout.SOUTH);
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
			squares[1][1].setText("Test");
		}
		else{
			letter = "O";
			squares[1][2].setText("Test2");
		} 
			
		//set the letter
		for (int i = 0; i < getWidth(); i++){
			for (int j = 0; j < getWidth(); j++){
				if (e.getSource() == squares[i][j]){
					squares[i][j].setText(letter);
				}
				else{
					squares[i][j].setText("ERROR!");
				}
			}
		}
	}
	
}