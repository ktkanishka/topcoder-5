/*
*	Problem Statement
*
*	In many computer systems and networks, different users are granted different levels of access to different resources. In this case, you are given a rights, indicating the privilege level of each user to use some system resource. You are also given a minPermission, which is the minimum permission a user must have to use this resource.
*
*	You are to return a indicating which users can and cannot access this resource. Each character in the return value corresponds to the element of users with the same index. 'A' indicates the user is allowed access, while 'D' indicates the user is denied access.
*
*	Definition
*	- Class: AccessLevel
*	- Method: canAccess
*	- Parameters: int[], int
*	- Returns: String
*	- Method signature: String canAccess(int[] rights, int minPermission)
*
*	Limits
*	- Time limit (s): 840.000
*	- Memory limit (MB): 64
*
*	Notes
*	- If users is empty, then a zero-length ("") should be returned.
*
*	Constraints
*	- users will contain between 0 and 50 elements, inclusive.
*	- Each element of users will be between 0 and 100, inclusive.
*	- minPermission will be between 0 and 100, inclusive.
*/

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