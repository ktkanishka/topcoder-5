public class AimToTen{
	public static int need(int[] marks) {
	    int total = 0;
	    for (int x : marks)
	        total += x;

	    return Math.max(19 * marks.length - 2 * total, 0);
	}
}