#Problem Statement

A DNA chain is a sequence of proteins of 4 types. The types are encoded using the characters 'A', 'C', 'G', 'T'. Two proteins are called complementary if one is of type 'A' and the other is of type 'T', or if one is of type 'C' and the other is of type 'G'. Two DNA chains are called complementary if they have equal length, and the i-th protein in the first chain and the i-th protein in the second chain are complementary for all possible values of i.

You will be given integers **first** and **second**, representing two DNA chains of equal length. Your goal is to make the two chains complementary. To do this, you can perform a number of replacements, where each replacement involves changing a single protein in either one of the chains to a different type. Return the minimum number of replacements required to achieve your goal.

##Definition
 - Class: `ComplementaryDNAChains`
 - Method: `minReplaces`
 - Parameters: `String, String`
 - Returns: `int`
 - Method signature: `int minReplaces(String first, String second)` (be sure your method is public)

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Constraints
 - **first** will contain between 1 and 50 characters, inclusive.
 - **second** will contain the same number of characters as **first**.
 - Each character in **first** and **second** will be 'A', 'C', 'G' or 'T'.
