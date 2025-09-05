package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";
    public static final String FIZZ_WHIZZ = "FizzWhizz";
    public static final String BUZZ_WHIZZ = "BuzzWhizz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int number) {
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return FIZZ_BUZZ_WHIZZ;
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return FIZZ_BUZZ;
        }
        if (number % 3 == 0 && number % 7 == 0) {
            return FIZZ_WHIZZ;
        }
        if (number % 5 == 0 && number % 7 == 0) {
            return BUZZ_WHIZZ;
        }
        if (number % 3 == 0) {
            return FIZZ;
        }
        if (number % 5 == 0) {
            return BUZZ;
        }
        if (number % 7 == 0) {
            return WHIZZ;
        }
        return String.valueOf(number);
    }
}
