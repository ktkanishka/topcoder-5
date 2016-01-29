public class BearPair{
	public int bigDistance( String s ){
		int biggestDistance = 0;
		for( int i = 0 ; i < s.length() ; i++ ){
			for( int j = s.length()-1 ; j > i ; j-- ){
				if( s.length() - i < biggestDistance ) break;
				if( s.charAt( i ) != s.charAt( j ) ){
					biggestDistance = Math.max( biggestDistance, j-i );
				}
			}
		}
		return ( biggestDistance == 0 ) ? -1 : biggestDistance;
	}
}