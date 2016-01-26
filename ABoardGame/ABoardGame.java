/*
*	Problem Statement
*	Your friends Alice and Bob are playing a board game. They have asked you to help them to determine the winner. The game is played on a square board with 2N rows and 2N columns. The exact rules of the game itself are not important for this problem. Once the game is over, each cell of the board is either empty or contains a single piece that belongs to either Alice or Bob. You are given board, where the j-th character in i-th element (0-based indices) describes the contents of the cell in row i, column j: '.' represents an empty cell, 'A' a cell with Alice's piece and 'B' a cell with Bob's piece.
*
*	The entire board is divided into N regions. Region 1 occupies the 4 central cells of the board. Each next region contains all cells that are horizontally, vertically or diagonally adjacent to cells of the immediately previous region and do not belong to any of the previous regions. For example, when N = 4, here is how the regions look:

*	4 4 4 4 4 4 4 4
*	4 3 3 3 3 3 3 4 
*	4 3 2 2 2 2 3 4 
*	4 3 2 1 1 2 3 4 
*	4 3 2 1 1 2 3 4 
*	4 3 2 2 2 2 3 4 
*	4 3 3 3 3 3 3 4 
*	4 4 4 4 4 4 4 4 
*
*	The winner is determined as follows. Consider the lowest numbered region that contains a different number of Alice's and Bob's pieces. The player who has more pieces in this region is the winner. If all regions contain the same number of Alice's and Bob's pieces, the game ends in a draw.
*
*	Return "Alice" if Alice wins the given game, "Bob" if Bob wins and "Draw" if the game ends in a draw. Note that return values are case-sensitive.
*
*	Definition
*	- Class: ABoardGame
*	- Method: whoWins
*	- Parameters: String[]
*	- Returns: String
*	- Method signature: String whoWins(String[] board)
*
*	Limits
*	- Time limit (s): 2.000
*	- Memory limit (MB): 256
*	
*	Constraints
*	- board will contain between 2 and 50 elements, inclusive.
*	- The number of elements in board will be even.
*	- Each element of board will contain the same number of characters as the number of elements in board.
*	- Each character in board will be 'A', 'B' or '.'.
*/

public class ABoardGame{
    public String whoWins(String[] board){
		
        int currentLevel = 1;	// Setting the current level.
        int N = board.length;	// Calculating the length of the board.
        int levels = N/2;		// Calculating the amount of levels.
        
		// Iterates for the amount of levels on the board.
		
        for(int i = 0 ; i < levels ; i++){
            
            int startingPoint = (N/2)-currentLevel;		// Starts the grid scan at the top left corner of the level.
			int aCount = 0;								// The initial amount of A's.
			int bCount = 0;								// The initial amount of B's.
            
			// Nested loop iterates through the current levels inner grid ( starting at the top left corner ).
			
            for(int j = 0 ; j < currentLevel*2 ; j++){				
                for(int k = 0 ; k < currentLevel*2 ; k++){
					
					// Checking if the current block is the outer edge of the current levels grid.
					
					if( j == 0 || j == currentLevel*2-1 || k == 0 || k == currentLevel*2-1 ){
						
						// Checking the current block for an 'A' or 'B'.
						
						if(board[startingPoint+j].charAt(startingPoint+k) == 'A'){
							aCount++;
						} else if(board[startingPoint+j].charAt(startingPoint+k) == 'B') {
							bCount++;
						}
					} else {
						continue;	// Continuing the loop if the current block is not on the outer edge of the current levels grid.
					}
                }
            }
			
			// Returns the winner, if there is a clear winner at the current level.
			
			if(aCount > bCount){
                return "Alice";
			} else if(bCount > aCount){
                return "Bob";
			}
            currentLevel++;		// Increments the level.
        }
        return "Draw";			// Returns 'Draw' if there is no clear winner after scanning the entire grid.
    }
}