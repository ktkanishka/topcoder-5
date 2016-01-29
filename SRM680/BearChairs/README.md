#Problem Statement

I guess you have never seen a bear eating at a table. The reason is simple: bears don't use tables. However, they may sometimes decide to sit on a chair while eating.

Bear Limak is a waiter in a huge restaurant for bears. The restaurant has infinitely many chairs. The chairs are arranged in a single long row. In order, they are numbered using all positive integers: 1, 2, 3, ... Chair number 1 is closest to the entrance to the restaurant.

A bear takes a lot of space while eating, and all bears value their personal space. Limak knows that there is a universal constant d with the following meaning: Whenever two bears sit on chairs, their chair numbers must differ by **d** or more. For example, if **d**=10, you can have two bears in chairs 47 and 57, but you cannot have bears in chairs 47 and 56.

The restaurant just opened for the day and all chairs are empty. During the day exactly **N** guests arrived, one at a time. Whenever a guest arrived, Limak assigned them a chair. Each guest stayed in the restaurant in their assigned chair until the end of the day.

Generally, guests don't like to be seated close to the entrance because of the noise from the street. You are given an integer array **atLeast** with **N** elements: one for each guest, in order. For each i from 0 to **N**-1, guest i came with a request: "My chair number must be greater than or equal to **atLeast[i]**."

When seating a guest, Limak always assigns them the smallest available chair number. (That is, the smallest chair number that matches the guest's request and is at least **d** away from each of the bears who are already in the restaurant.) Return a with **N** elements: for each guest, in the order in which they arrived, the number of the chair where they will be seated.

##Definition
 - Class: `BearChairs`
 - Method: `findPositions`
 - Parameters: `int[], int`
 - Returns: `int[]`
 - Method signature: `int[] findPositions(int[] atLeast, int d)` (be sure your method is public)

##Limits
 - Time limit (s): `2.000`
 - Memory limit (MB): `256`

##Constraints
 - **N** will be between 1 and 1000, inclusive.
 - **atLeast** will have exactly **N** elements.
 - Each element in **atLeast** will be between 1 and 10^6, inclusive.
 - **d** will be between 1 and 10^6, inclusive.
