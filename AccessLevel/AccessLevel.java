public class AccessLevel{
	public String canAccess(int[] rights, int minPermission){
		String output = "";		// Initializing the output String.
		
		// Iterates through the users' rights.
		
		for(int x : rights){
			
			// Checks whether the user has sufficients rights to access the resource.
			
			if(x < minPermission)
				output += "D";
			else
				output += "A";
		}
		
		return output;		// Returns the output String.
	}
}