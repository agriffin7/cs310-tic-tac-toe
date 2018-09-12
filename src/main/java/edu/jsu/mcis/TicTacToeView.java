package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
		for(int i = 0; i <= width; i++){
			System.out.print(i);
		}
		for(int j = 0; j <= width; j++){
			System.out.print(j);
			for(int k = 0; k <= width; k++){
				System.out.print(grid[j][k]);
			}
		}
    }
		

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

		System.out.print("Enter the row and column numbres, separated by a space:")
		
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        System.out.prinln("That is not a valid input!")

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}