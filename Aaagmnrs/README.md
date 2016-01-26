#Problem Statement

Two **phrases** are anagrams if they are permutations of each other, ignoring spaces and capitalization. For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote". Given a vector **phrases**, remove each phrase that is an anagram of an earlier phrase, and return the remaining **phrases** in their original order.

##Definition
 - Class: `Aaagmnrs`
 - Method: `anagrams`
 - Parameters: `vector <string>`
 - Returns: `vector <string>`
 - Method signature: `vector <string> anagrams(vector <string> phrases)` (be sure your method is public)

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Constraints
- **phrases** contains between 2 and 50 elements, inclusive.
- Each element of **phrases** contains between 1 and 50 characters, inclusive.
- Each element of **phrases** contains letters ('a'-'z' and 'A'-'Z') and spaces (' ') only.
- Each element of **phrases** contains at least one letter.
