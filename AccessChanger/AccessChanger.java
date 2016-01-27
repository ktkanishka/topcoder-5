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