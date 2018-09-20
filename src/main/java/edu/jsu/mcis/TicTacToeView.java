package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import edu.jsu.mcis.TicTacToeModel.Mark;
import edu.jsu.mcis.TicTacToeModel.Result;

public class TicTacToeView extends JPanel implements ActionListener {
    
    TicTacToeModel model;

    private JButton[][] squares;
    private JPanel squaresPanel;
    private JLabel resultLabel;

    public TicTacToeView(TicTacToeModel model) {

        this.model = model;

        int width = model.getWidth();

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        squares = new JButton[width][width];
        squaresPanel = new JPanel(new GridLayout(width,width));
        resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");
        
        for (int row = 0; row < width; row++){
            
            for (int col = 0; col < width; col++){
                
                squares[row][col] = new JButton(); 
                squares[row][col].addActionListener(this);
                squares[row][col].setName("Square" + row + col);
                squares[row][col].setPreferredSize(new Dimension(64,64));
                squaresPanel.add(squares[row][col]);
                
            }
            
        }

        this.add(squaresPanel);
        this.add(resultLabel);
        
        resultLabel.setText("Welcome to Tic-Tac-Toe!");

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        /* Handle button clicks.  Extract the row and col values from the name
           of the button that was clicked, then make the mark in the grid using
           the Model's "makeMark()" method.  Finally, use the "updateSquares()"
           method to refresh the View.  If the game is over, show the result
           (from the Model's "getResult()" method) in the result label. */
        
        String name = ((JButton) event.getSource()).getName(); // Get button name
        
        // INSERT YOUR CODE HERE
		  // INSERT YOUR CODE HERE
        int row = 0;
        int col = 0;
		int rowUniCode = name.codePointAt(6);
		int colUniCode = name.codePointAt(7);
		
		if (rowUniCode == 48) {
			row = 0;
		}
		if (rowUniCode == 49) {
			row = 1;
		}
		if (rowUniCode == 50) {
			row = 2;
		}
		if (colUniCode == 48) {
			col = 0;
		}
		if (colUniCode == 49) {
			col = 1;
		}
		if (colUniCode == 50) {
			col = 2;
		}
		//make mark
		model.makeMark(row, col);
		
		//update squares
		updateSquares();
		
		//Test to see if game has ended
		if (model.getResult() == Result.X) {
			resultLabel.setText("X");
		}
		if (model.getResult() == Result.O) {
			resultLabel.setText("O");
		}
		if (model.getResult() == Result.TIE) {
			resultLabel.setText("Tie");
		}
		

    }
        
    public void updateSquares() {

        int MarkRowLocation = 0;
    	int MarkColLocation = 0;
    	String Marktype = "ERROR";

        /* Loop through all View buttons and (re)set the text of each button
           to reflect the grid contents (use the Model's "getMark()" method). */
    	
    	for (int row = 0; row < 3; row++) {
    		for (int col = 0; col < 3; col++) {
    			if (model.getMark(row, col) == Mark.X) {
    				Marktype = "X";
    				MarkRowLocation = row;
    				MarkColLocation = col;
    			}
    			if (model.getMark(row, col) == Mark.O) {
    				Marktype = "O";
    				MarkRowLocation = row;
    				MarkColLocation = col;
    			}
    		}	
    	}
    	squares[MarkRowLocation][MarkColLocation].setText(Marktype);

    }
        
    public void showResult(String message) {
        resultLabel.setText(message);
    }

}
