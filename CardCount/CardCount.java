import java.util.Arrays;
public class CardCount{
	public String[] dealHands( int numPlayers, String deck ){
		String[] hands = new String[ numPlayers ];
		Arrays.fill( hands, "" );
		deck = deck.substring( 0, deck.length() - ( deck.length() % numPlayers ) );
		for( int i = 0 ; i < deck.length() ; i += hands.length ){
			for( int j = 0 ; j < hands.length ; j++ ){
				hands[j] += deck.charAt( i + j );
			}
		}
		return hands;
	}
}