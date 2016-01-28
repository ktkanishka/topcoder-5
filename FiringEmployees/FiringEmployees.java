public class FiringEmployees{
	public int fire( int[] manager, int[] salary, int[] productivity ){
		int highestProfit = 0, currentProfit = 0;
		int lowestIndex = manager.length;

		for( int i = 0 ; i < manager.length ; i++ ){
			currentProfit += productivity[i] - salary[i];
			if( currentProfit > highestProfit ){
				highestProfit = currentProfit;
				lowestIndex = i;
			}
		}
		return highestProfit;
	}
}