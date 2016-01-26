#Problem Statement

You are converting old code for a new compiler version. Each "->" string should be replaced by ".", but this replacement shouldn't be done inside comments. A comment is a string that starts with "//" and terminates at the end of the line.

You will be given a String array **program** containing the old code. Return a containing the converted version of the code.

##Definition
 - Class: `AccessChanger`
 - Method: `convert`
 - Parameters: `String[]`
 - Returns: `String[]`
 - Method signature: `String[] convert(String[] program)` (be sure your method is public)

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Constraints
 - **program** will have between 1 and 50 elements, inclusive.
 - Each element of **program** will contain between 1 and 50 characters, inclusive.
 - Each character in **program** will have ASCII value between 32 and 127, inclusive.
