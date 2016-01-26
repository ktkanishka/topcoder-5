#Problem Statement

In many computer systems and networks, different users are granted different levels of access to different resources. In this case, you are given an int array **rights**, indicating the privilege level of each user to use some system resource. You are also given an integer **minPermission**, which is the minimum permission a user must have to use this resource.

You are to return a indicating which users can and cannot access this resource. Each character in the return value corresponds to the element of **rights** with the same index. 'A' indicates the user is allowed access, while 'D' indicates the user is denied access.

##Definition
 - Class: `AccessLevel`
 - Method: `canAccess`
 - Parameters: `int[], int`
 - Returns: `String`
 - Method signature: `String canAccess(int[] rights, int minPermission)` (be sure your method is public)

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Notes
 - If **rights** is empty, then a zero-length ("") should be returned.

##Constraints
 - **rights** will contain between 0 and 50 elements, inclusive.
 - Each element of **rights** will be between 0 and 100, inclusive.
 - **minPermission** will be between 0 and 100, inclusive.
