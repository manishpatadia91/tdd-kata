package kata.com

import spock.lang.Specification

class CalculatorSpec extends Specification{
	def Calculator calc = new Calculator()
	def "Test to add numbers"() {
		given : "input as string"
			input
		when : "calc.add(input) called"
			def output = calc.add(input)
		then : "It should add numbers provided into input"
			output == expectedOutput
		where : "Provided input"
			input					||	expectedOutput
			""						||		0
			"1"						||		1
			"1,2"					||		3
			"1,2,3"					||		6
			"1,2,3,4,8"				||		18
			"1\n2,3"				||		6
			"1,\n"					||		1
			"//;\n1;2"				||		3
			"//.\n1.2"				||		3
	}
		
}
	