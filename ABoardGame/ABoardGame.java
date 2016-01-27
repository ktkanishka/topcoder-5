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