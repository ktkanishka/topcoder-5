public class DoubleOrOne{
	public int minimalSteps(int a, int b, int newA, int newB){
		for( int count = 0 ; ; count++ ){

			if( newA == a && newB == b )
				return count;
			if( newA < a || newB < b )
				return -1;

			if( newA % 2 == 0 && newB % 2 == 0 && a >= newA/2 && b >= newB/2 ){
				newA /=2;
				newB /= 2;
			} else if( a >= newA-1 && b >= newB-1 ){
				newA--;
				newB--;
			} else {
				return -1;
			}
		}
	}
}