public class DepositProfit{
	public int depositTerm( int amount, int annualInterest, int profit ){
		return ( int )( Math.log( amount + profit ) / Math.log( 1 + annualInterest/12 ) );
	}
}