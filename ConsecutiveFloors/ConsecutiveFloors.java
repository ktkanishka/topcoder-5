public class ConsecutiveFloors{
	public String isConsistent( int[] x, int[] y ){
		for( int i = 0 ; i < x.length ; i++ ){
			int permutations = 0;

			for( int j = 0 ; j < y.length ; j++ ){
				permutations += ( i - ( j - 1 ) );
			}

			if( permutations < y[i] )
				return "Inconsistent";
		}

		return "Consistent";
	}
}