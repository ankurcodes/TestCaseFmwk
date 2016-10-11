package util.other.arrayutility;

public class IntegerUtility {
	public static int generateRandomNumberInRange(int max, int min) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
}
