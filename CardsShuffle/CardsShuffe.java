public class CardsShuffle{
	 public String shuffle(String cards, int first, int last, int times){
	 	for( int i = 0 ; i < times ; i++ ){
	 		cards = cards.substring( first-1, last ) + cards.substring( 0, first-1 ) + cards.substring( last, cards.length() );
	 	}
	 	return cards;
	 }
}