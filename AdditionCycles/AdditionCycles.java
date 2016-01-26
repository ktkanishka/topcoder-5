public class AdditionCycles{
	 public static int cycleLength( int n ){

	 	int cycles = 0, original = n;
	 	
	 	do{
	 		cycles++;
			n = ( ( ( n / 10 ) + ( n % 10 ) ) % 10 ) + ( n % 10 ) * 10;
	 	} while( n != original );

	 	return cycles;
	 }
}