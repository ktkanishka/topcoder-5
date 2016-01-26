#Problem Statement
In aviation, a "near miss" occurs if the distance between two aircraft at some point in time is less than or equal to some threshold distance **R**. At a moment in time, the positions and velocities of two aircraft are known exactly. Assuming that each aircraft continues to fly with constant speed and direction, you need to work out if the aircraft will undergo a near miss now or at some point in the future.

You will be given the threshold distance **R** and the positions and velocities of the aircraft in 4 s: **p1**, **v1**, **p2** and **v2**. The position of the first aircraft in 3-D cartesian space is given by (**p1**[0] , **p1**[1] , **p1**[2]) and its velocity vector by (**v1**[0] , **v1**[1] , **v1**[2]) and similarly the second aircraft's position and velocity are given by (**p2**[0] , **p2**[1] , **p2**[2]) and (**v2**[0] , **v2**[1] , **v2**[2]). So, if an aircraft's initial position is the vector **p** and its velocity vector is **v**, the position of this aircraft at some future time **t** will be **p** + **v** * **t**. You should return a String containing "YES" if the aircraft will undergo a near miss now or in the future or "NO" if they won't (quotes for clarity).

##Definition
 - Class: `Aircraft`
 - Method: `nearMiss`
 - Parameters: `int[], int[], int[], int[], int`
 - Returns: `String`
 - Method signature: `String nearMiss(int[] p1, int[] v1, int[] p2, int[] v2, int R)` (be sure your method is public)

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Notes
 - The **distance** between two points (x1, y1, z1) and (x2, y2, z2) is given by sqrt((x1-x2)2 + (y1-y2)2 + (z1-z2)2).
 
##Constraints
 - **p1**, **v1**, **p2** and **v2** will contain exactly 3 elements.
 - Each element of **p1**, **v1**, **p2** and **v2** will be between -10000 and 10000, inclusive.
 - **R** will be between 0 and 10000, inclusive.
