package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_normal_number_when_not_divisible_by_3_or_5() {
        //given
        int number = 1;
        String result = getResult(number);
        //then
        assertEquals("1", result);
    }

    private static String getResult(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.countOff(number);
        return result;
    }

    @Test
    public void should_return_fizz_when_divisible_by_3_but_not_5() {
        //given
        int number = 3;
        String result = getResult(number);
        //then
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_buzz_when_divisible_by_5_but_not_3() {
        //given
        int number = 5;
        String result = getResult(number);
        //then
        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_fizz_buzz_when_divisible_by_3_and_5() {
        //given
        int number = 15;
        String result = getResult(number);
        //then
        assertEquals("FizzBuzz", result);
    }



}
