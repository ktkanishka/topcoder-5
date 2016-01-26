public class Aircraft{
	public static void main(String[] args){
		int[] p1 = {-7163,-371,-2459};
		int[] v1 = {-59,-41,-14};
		int[] p2 = {-2398,-426,-5487};
		int[] v2 = {-43,27,67};
		int R = 5410;

		System.out.println( nearMiss( p1, v1, p2, v2, R ) );

	}

	public static String nearMiss(int[] p1, int[] v1, int[] p2, int[] v2, int R){
		int distance = 0;
		int prevDistance = (int)(Math.sqrt( Math.pow( ( p2[0] - p1[0] ), 2 ) + Math.pow(  ( p2[1] - p1[1] ) , 2 ) + Math.pow( ( p2[2] -  p1[2] ), 2 ) ));

		for(int t = 1 ; ; t++){
			distance = (int)(Math.sqrt( Math.pow( ( ( p2[0] + v2[0] * t ) - ( p1[0] + v1[0] * t ) ), 2 ) + Math.pow( ( ( p2[1] + v2[1] * t ) - ( p1[1] + v1[1] * t ) ), 2 ) + Math.pow( ( ( p2[2] + v2[2] * t ) - ( p1[2] + v1[2] * t ) ), 2 ) ));

			System.out.println( "Distance: " + distance  + "\tR: " + R);

			if( distance <= R ){
				return "YES";
			}

			if( Math.abs( distance ) < Math.abs( prevDistance ) ){
                prevDistance = distance; 
				continue;
			} else {
				return "NO";
			}
		}
	}
}