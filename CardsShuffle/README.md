#Problem Statement

You are given a String **cards**, which represents a sequence of cards. Shuffle the cards by repeatedly performing the specified exchange operation. The exchange operation is specified by the integers **first** and **last**, which are both 1-based indices in the sequence. Take all the cards between the first-th card and the last-th card, inclusive, and move them to the beginning of the sequence. Do not change the relative order of the moved cards. For example, if first = 2 and last = 4, an exchange operation on "ABCDEFG" would produce "BCDAEFG".

Perform the specified exchange operation **times** times on the given sequence and return a containing the resulting sequence.

##Definition
 - Class: `CardsShuffle`
 - Method: `shuffle`
 - Parameters: `String, int, int, int`
 - Returns: `String`
 - Method signature: `String shuffle(String cards, int first, int last, int times)` (be sure your method is public)

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Constraints
 - **cards** will contain between 1 and 50 characters, inclusive.
 - **cards** will contain only uppercase letters ('A'-'Z').
 - **first** will be between 1 and n, inclusive, where n is the number of characters in cards.
 - **last** will be between first and n, inclusive, where n is the number of characters in cards.
 - **times** will be between 1 and 100, inclusive.
