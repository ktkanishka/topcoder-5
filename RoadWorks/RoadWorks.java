public class RoadWork{
	public int fraudFeet( int[] start, int[] end ){
		int feet = 0;
		for( int i = 0 ; i < start.length ; i++ ){
			for( int j = i+1 ; j < end.length ; j++ ){

				int overlapStart = Integer.MAX_VALUE , overlapEnd = 0;

				if( start[j] < end[i] ){
					overlapStart = Math.max( start[i], start[j] );
					overlapEnd = Math.min( end[i], end[j] );
				}
			}
		}
		return feet;
	}
}