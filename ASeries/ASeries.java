/*
*	Problem Statement
*	*** You may only submit a given problem once - no resubmissions will be accepted. ***
*
*	An arithmetic series consists of a sequence of terms such that each term minus its immediate predecessor *	gives the same result. For example, the sequence 3,7,11,15 is the terms of the arithmetic series *	3+7+11+15; each term minus its predecessor equals 4. (Of course there is no requirement on the first *	term since it has *no predecessor.)
*
*	Given a collection of integers, we want to find the longest arithmetic series that can be formed by *	choosing a sub-collection (possibly the entire collection). Create a class ASeries that contains a *	method longest that *is given a values and returns the length of the longest arithmetic series that can *	be formed from values.
*
*	Definition
*	- Class: ASeries
*	- Method: longest
*	- Parameters: int[]
*	- Returns: int
*	- Method signature: int longest(int[] values)
*
*	Limits
*	- Time limit (s): 840.000
*	- Memory limit (MB): 64
*
*	Constraints
*	- values will contain between 2 and 50 elements inclusive.
*	- Each element of values will be between -1,000,000 and 1,000,000 inclusive.
*/

import java.util.Arrays;

public class ASeries{
	public static void main(String[] args){
		int[] test = {3,8,4,5,6,2,2};
		System.out.println(longest(test));
	}
	
	public static int longest(int[] values){
		Arrays.sort(values);
		
		int min = values[0];
		int next = 0;
		
		for(int x : values){
			if(){
				
			}
		}
		
		return 0;
	}
}