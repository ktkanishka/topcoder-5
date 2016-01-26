import math
class BalancedGame:
	def result( self, conflicts, p, q ):
		if p == 0 or q == 0:
			return -1
        
		for i in range( len( conflicts ) ):
			min_wins = math.ceil( ( len( conflicts[i] ) - 1 ) * ( float( p ) / 100 ) );
			min_losses = math.ceil( ( len ( conflicts[i] ) - 1 ) * ( float( q ) / 100 ) );

			for game in conflicts[i]:
				if game == "W":
					min_wins -= 1
				elif game == "L":
					min_losses -= 1

				if min_wins <= 0 and min_losses < 0:
					break
			if min_wins > 0 or min_losses > 0:
				return i
		return -1