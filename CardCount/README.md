#Problem Statement

You are dealing cards to a group of players. In this game, the cards are numbered 0-9 and have no distinguishing characteristics other than their numbers. A given deck may have many cards that share the same number. You are given an integer **numPlayers** that represents the number of people playing. You are also given a String **deck** which contains the cards to be used (0th character is the top of the deck, and the last character is the bottom). You will deal the cards starting with player 0, then player 1, until you reach player numPlayers-1, dealing one card at a time. Then you repeat this process until the cards are exhausted. Cards are always dealt from the top of the deck.

You will return a String array that shows each of the players' cards in the order they were dealt (cards dealt earlier show up earlier in the particular ). Player k's hand corresponds to element k of the returned . One added constraint is that each player must be dealt the same number of cards. To enforce this constraint you will not deal extra cards that will unbalance the players' hands (cards held). In other words, if you have dealt to the last player, and don't have enough cards to deal another to every player, stop dealing. The returned must contain exactly **numPlayers** elements, each element containing exactly the same number of characters.

##Definition
 - Class: `CardCount`
 - Method: `dealHands`
 - Parameters: `int, String`
 - Returns: `String[]`
 - Method signature: `String[] dealHands(int numPlayers, String deck)` (be sure your method is public)

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Constraints
 - **numPlayers** will be between 1 and 50 inclusive
 - **deck** will contain between 0 and 50 characters inclusive, all of which are numeric (0-9)
