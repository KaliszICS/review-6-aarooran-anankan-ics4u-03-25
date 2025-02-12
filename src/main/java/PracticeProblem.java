public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static int sum(int num1, int num2) { //1
		int result = num1 + num2;
		return result;
	}

	public static int difference(int num1, int num2) { //2
		int result = num1 - num2;
		return result;
	}

	public static double product(double num1, double num2) { //3
		double result = num1 * num2;
		return result;
	}

	public static String removeFirst(String word) { //4
		String result = word.substring(1);
		return result;
	}

	public static int combinedLength(String word1, String word2) { //5
		int result = word1.length() + word2.length();
		return result;
	}

	public static boolean isEven(int num1) { //6
		double sign = num1%2;
		boolean result = sign == 0;
		return result;
	}

	public static boolean isOdd(int num1) { //7
		double sign = num1%2;
		boolean result = sign != 0;
		return result;
	}

	public static boolean isPositive(int num1) { //8
		boolean result = num1 > 0;
		return result;
	}

	public static boolean isNegative(int num1) { //9
		boolean result = num1 < 0;
		return result;
	}

}
