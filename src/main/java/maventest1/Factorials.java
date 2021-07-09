package maventest1;

public class Factorials {

	public static String ReverseFactorial(int x) {
		int divide_by = 2;

		while (x % divide_by == 0) {
			x /= divide_by;
			divide_by++;
		}

		if (x == 1) {
			return String.valueOf(divide_by - 1);
		} else {
			return "NONE";
		}
	}
}

// public int Factorial(int n) {

// for (int i = 2; i <= n; i++) {
// if (n % i == 0) {
// n = n / i;
// } else if (n == 0) {
// return 1;
// } else if (n == 1) {
// return i;
// }
// }

//		return 0;

// }
//}