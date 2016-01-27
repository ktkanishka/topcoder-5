#Problem Statement

You will be given a tuple, **conflicts**, where each element represents a single player in a multiplayer game. Element i represents player i, and character j of element i represents whether player i will win ('W'), tie ('T'), or lose ('L') against player j.

Your task is to ensure that each player wins against at least **p%** of the other players, and loses against at least **q%** of the other players. You should return the 0-based index of the first player in the input (lowest index) that does not meet these requirements, or -1 if all players meet them. Note that if there are N players total, then at least ceil((N-1)*p/100) of the characters in element i must be 'W' for player i to meet the requirements. The formula for losses is analogous.

##Definition
 - Class: `BalancedGame`
 - Method: `result`
 - Parameters: `tuple (string), integer, integer`
 - Returns: `integer`
 - Method signature: `def result(self, conflicts, p, q):`

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Notes
- The i-th character of the i-th element of conflicts will always be 'T' and can be ignored.
- The function 'ceil' in ceil((N-1)*p/100) returns the least integer greater than or equal to its argument. For example, ceil(1.5)=2 and ceil(4)=4.

##Constraints
- **p** and **q** will be between 0 and 100, inclusive.
- **conflicts** will have between 2 and 50 elements, inclusive.
- Each element of **conflicts** will have the same number of characters ('W', 'L' and 'T') as the number of elements in conflicts.
- If the j-th character of the i-th element of **conflicts** is 'W', 'L', or 'T' then the i-th character of the j-th element will be 'L', 'W' or 'T' respectively.
- The i-th character of the i-th element of **conflicts** will always by 'T'.
