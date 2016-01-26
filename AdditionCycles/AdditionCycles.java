public class AdditionCycles{
	public static void main(String[] args){
		int[] tests = { 26, 55, 0, 71 };
		int[] expectedResults = { 4, 3, 1, 12 };

		for( int i = 0 ; i < tests.length ; i++ ){
			int result = cycleLength( tests[i] );
			System.out.print(tests[i] + "\t" + expectedResults[i] + "\t" + result + "\t");

			if( result == expectedResults[i] ){
				System.out.println("PASSED");
			} else {
				System.out.println("FAILED");
			}
		}
	}

	 public static int cycleLength( int n ){

	 	int cycles = 0, original = n;
	 	
	 	do{
	 		cycles++;
			n = ( ( ( n / 10 ) + ( n % 10 ) ) % 10 ) + ( n % 10 ) * 10;
	 	} while( n != original );

	 	return cycles;
	 }
}