import java.util.Arrays;
public class BearChairs{
	public int[] findPositions( int[] atLeast, int d ){
		int[] seats = new int[ atLeast.length ];
		int largestSeat = 0;
		for( int i = 0 ; i < atLeast.length ; i++ ){
			if( ( i == 0 ) || ( atLeast[i] + d <= seats[0] ) ) {
				seats[i] = atLeast[i];
			} else {
				for( int j = 1 ; j < i ; j++ ){
					if( ( atLeast[i] - seats[j-1] >= d ) && ( atLeast[i] + d <= seats[j] ) ){
						seats[i] = atLeast[i];
					}
				}
				
				if( seats[i] == 0 ){
					seats[i] = Math.max( largestSeat + d, atLeast[i] );
				}
			}
			largestSeat = Math.max( largestSeat, seats[i] );
		}
		return seats;
	}
}