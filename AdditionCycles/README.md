#Problem Statement

Start with any integer between 00 and 99, inclusive, written as two digits (use a leading zero if the number is less than 10). Add the two digits together. Now concatenate the rightmost digit of the first number with the rightmost digit of the sum to get a new number. If you repeat this process enough times, you'll end up back at the original number. For example:
```
			    Combine Second Digits of
Start With    Add Digits    the Original and the Sum
------------------------------------------------------
    26     :   2+6 = 08   :   "6" and "8" = 68 
    68     :   6+8 = 14   :   "8" and "4" = 84
    84     :   8+4 = 12   :   "4" and "2" = 42
    42     :   4+2 = 06   :   "2" and "6" = 26
```
In this case, it took us 4 steps to get back to where we started, so we would return 4. Starting with **n**, return the number of steps it takes to get back to **n**.

##Definition
 - Class: `AdditionCycles`
 - Method: `cycleLength`
 - Parameters: `int`
 - Returns: `int`
 - Method signature: `int cycleLength(int n)` (be sure your method is public)

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Constraints
 - **n** will be between 0 and 99, inclusive.
