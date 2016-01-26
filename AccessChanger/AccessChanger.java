/*	
*	Problem Statement
*
*	You are converting old code for a new compiler version. Each "->" string should be replaced by ".", but this replacement shouldn't be done inside comments. A comment is a string that starts with "//" and terminates at the end of the line.
*
*	You will be given a program containing the old code. Return a containing the converted version of the code.
*
*	Definition
*	- Class: AccessChanger
*	- Method: convert
*	- Parameters: String[]
*	- Returns: String[]
*	- Method signature: String[] convert(String[] program)
*
*	Limits
*	- Time limit (s): 840.000
*	- Memory limit (MB): 64
*
*	Constraints
*	- program will have between 1 and 50 elements, inclusive.
*	- Each element of program will contain between 1 and 50 characters, inclusive.
*	- Each character in program will have ASCII value between 32 and 127, inclusive.
*/

public class AccessChanger{ 
	public String[] convert(String[] program){
		
		// Iterating through the lines of the program.
		
		for(int i = 0 ; i < program.length ; i++){
			
			// Checking if there is any need to account for comments in the current line.
			
			if(program[i].indexOf("//") < 0){
				program[i] = program[i].replaceAll("->", ".");	// Replaces all instances of access modifier.
			} else {
				String tmp = program[i].substring(program[i].indexOf("//"), program[i].length());		// Extracts the commented out code.
				program[i] = program[i].substring(0, program[i].indexOf("//")).replaceAll("->", ".");	// Replaces all instances of access modifier.
				program[i] = program[i].concat(tmp);													// Adds the unchanged commented section back on.
			}
		}
		return program;		// Returns the converted program.
	}
}