package kata.com;

public class Calculator {

	public int add(String input) {
		if (input.isEmpty()) {
			return 0;
		}
		String[] numbers = input.split(",|\n");
		return sumOfNumbers(numbers);
	}

	private int sumOfNumbers(String[] numbers) {
		int nSum = 0;
		for(String num : numbers) {
			nSum = nSum + stringToInt(num);
		}
		return nSum;
	}

	private int stringToInt(String str) {
		return Integer.parseInt(str);
	}

}
