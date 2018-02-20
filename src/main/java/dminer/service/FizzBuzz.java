package main.java.dminer.service;

public class FizzBuzz {

	public String say(int number) {
		String fizzBuzz = "";
		if( number == 15) return "FizzBuzz" ;
		if( number%3 == 0) return "Fizz" ;
		if( number%5 == 0) return "Buzz" ;
		return String.valueOf(number);
	}
}
