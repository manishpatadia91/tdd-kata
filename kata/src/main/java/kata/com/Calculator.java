package kata.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public int add(String input) {
		if (input.isEmpty()) {
			return 0;
		}
		String[] numbers = tokenizer(input);
		return sumOfNumbers(numbers);
	}

	private String[] tokenizer(String input) {
		if(isCustomDelimiter(input)) {
			return splitByCustomDelimiter(input);
		} else {
			return splitByDefaultDelimiter(input);
		}
	}

	private String[] splitByDefaultDelimiter(String input) {
		String[] tokens = input.split(",|\n");
		return tokens;
	}

	private String[] splitByCustomDelimiter(String input) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
		m.matches();
		String customDelimiter = m.group(1);
		String numbers = m.group(2);
		return numbers.split(Pattern.quote(customDelimiter));
	}

	private boolean isCustomDelimiter(String input) {
		return input.startsWith("//");
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
