#Problem Statement

Bear Limak loves algorithms, especially the ones with words and strings.

Limak's friend recently entered a programming competition and wrote a program. The program contains a string constant **s**. Limak would now like to challenge the program by making it exceed the time limit. To do that, he must find two different characters in **s** that are as far apart as possible.

Formally, Limak must find two integers i and j with the following properties:

 - Both i and j must be valid indices into **s**. That is, both numbers must be between 0 and n-1, inclusive, where n is the length of **s**.
 - The characters **s**[i] and **s**[j] must be different.
 - The difference between i and j must be as large as possible.


You are given the **s**. If Limak cannot choose any integers with the required properties, return -1. Otherwise, return the largest possible difference between i and j.

##Definition
 - Class: `BearPair`
 - Method: `bigDistance`
 - Parameters: `String`
 - Returns: `int`
 - Method signature: `int bigDistance(String s)` (be sure your method is public)

##Limits
 - Time limit (s): `2.000`
 - Memory limit (MB): `256`

##Constraints
 - **s** will have between 2 and 50 characters, inclusive.
 - Each character in **s** will be a lowercase English letter ('a' - 'z').
