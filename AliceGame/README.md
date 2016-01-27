#Problem Statement

Alice and Kirito just played a game. The game consisted of a finite (possibly empty) sequence of turns. You do not know the exact number of turns. The turns were numbered starting from 1. In each turn, exactly one of our two players won. The winner of turn i scored 2*i-1 points.

You are given two longs **x** and **y**. Find out whether it is possible that at the end of the game Alice had exactly **x** points and Kirito had exactly **y** points. If it is possible, return the smallest number of **turns** Alice could have won. If the given final result is not possible, return **-1** instead.

##Definition
 - Class: `AliceGame`
 - Method: `findMinimumValue`
 - Parameters: `long long, long long`
 - Returns: `long long`
 - Method signature: `long long findMinimumValue(long long x, long long y)` (be sure your method is public)

##Limits
 - Time limit (s): `2.000`
 - Memory limit (MB): `256`

##Constraints
 - **x** and **y** are between 0 and 1,000,000,000,000, inclusive.
