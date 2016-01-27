#Problem Statement

You have been given a secret mission where you must break the enemy's code. You have already figured out that they encode messages using the following method. Each letter between 'a' and 'z', inclusive, is assigned a distinct two-digit number between 01 and 26, inclusive. A message is encoded by simply replacing each letter with its assigned number. For example, if 't' is assigned 20, 'e' is assigned 05 and 's' is assigned 19, then the message "test" is encoded as "20051920". All original messages contain only lowercase letters.

You are given a **code** containing the assignment of numbers to letters. The first letter of **code** is assigned 01, the second is assigned 02 and so on. You are also given a **message** which is either an original unencoded **message** or an encoded **message**. If you are given an unencoded **message**, return the encoded version of that **message**, and if you are given an encoded **message**, return the original unencoded **message**.

##Definition
 - Class: `BreakingTheCode`
 - Method: `decodingEncoding`**
 - Parameters: `String, String`
 - Returns: `String`
 - Method signature: `String decodingEncoding(String code, String message)` (be sure your method is public)

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Constraints
 - code will contain exactly 26 characters.
 - Each lowercase letter between 'a' and 'z', inclusive, will occur exactly once in code.
 - message will contain between 1 and 50 characters, inclusive.
 - message will either contain only lowercase letters ('a'-'z') or only digits ('0'-'9').
 - If message contains only digits, it will be a concatenation of two-digit numbers, each between 01 and 26, inclusive.
