class BlackjackWinner:
	def winnings(self, bet, dealer, dealerBlackjack, player, blackjack):
		if ( player > 21 ) or ( dealer < 21 and dealer > player ) or ( dealerBlackjack and not blackjack and player == 21):
			return bet * -1
		elif ( player <= 21 and player > dealer and not blackjack):
			return bet;
		elif ( not dealerBlackjack and blackjack ):
			return bet * 1.5
		else:
			return 0