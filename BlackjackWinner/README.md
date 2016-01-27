#Problem Statement

In the game of blackjack, if the player scores higher than the dealer or the dealer goes over 21, and the player does not go over 21, then he wins his bet (in addition to keeping his original wager). If he scores 21 or less, and the same as the dealer, the hand is a push, and he keeps his bet. Otherwise, if he scores lower than the dealer, or goes over 21 (regardless of whether or not the dealer also does so), then he loses his bet.

A "blackjack" is a special kind of 21 point hand that beats all other hands. In such a case, the player wins 1.5 times his original bet. If both dealer and player have a blackjack, then the hand is a push. Note that if the dealer has a blackjack, and the player has a 21 (but does not have blackjack), then the dealer wins, and the player loses his wager.

You are given an integer **bet** indicating the players wager, an integer **dealer** indicating the dealer's score, and an integer **player** indicating the player's score. Finally, you are given an integer **blackjack**, which will be equal to 1 if the player has a blackjack, or 0 otherwise. Likewise, you are given the integer **dealerBlackjack**.

You are to return the amount of money the player wins or loses on the hand. A win should return a positive number, either the player's bet, or 1.5 times his bet. A loss should be returned as a negative number. A push should return 0.

##Definition
 - Class: `BlackjackWinner`
 - Method: `winnings`
 - Parameters: `integer, integer, integer, integer, integer`
 - Returns: `integer`
 - Method signature: `def winnings(self, bet, dealer, dealerBlackjack, player, blackjack):`

##Limits
 - Time limit (s): `840.000`
 - Memory limit (MB): `64`

##Constraints
 - **bet** will be between 2 and 100, inclusive, and will be even.
 - **dealer** will be between 17 and 26, inclusive.
 - **dealerBlackjack** will be 0 or 1.
 - **dealerBlackjack** may only be 1 if dealer is 21.
 - **player** will be between 4 and 30, inclusive.
 - **blackjack** will be 0 or 1.
 - **blackjack** may only be 1 if player is 21.
