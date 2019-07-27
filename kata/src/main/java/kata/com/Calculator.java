package kata.com;

public class Calculator {

	public int add(String input) {
		if (input.isEmpty()) {
			return 0;
		}
		String[] numbers = input.split(",");
		if (numbers.length == 1) {
			return stringToInt(numbers[0]);
		} else {
			return sumOfNumbers(numbers[0], numbers[1]);
		}
	}

	private int sumOfNumbers(String num1, String num2) {
		return stringToInt(num1) + stringToInt(num2);
	}

	private int stringToInt(String str) {
		return Integer.parseInt(str);
	}

}
