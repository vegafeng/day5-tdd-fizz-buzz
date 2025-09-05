package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_normal_number_when_not_divisible_by_3_or_5_or_7() {
        //given
        int number = 1;
        String result = getResult(number);
        String target = "1";
        //then
        assertEquals(target, result);
    }

    @Test
    public void should_return_fizz_when_divisible_by_3_but_not_5_not_7() {
        //given
        int number = 3;
        String result = getResult(number);
        String target = "Fizz";
        //then
        assertEquals(target, result);
    }

    @Test
    public void should_return_buzz_when_divisible_by_5_but_not_3_not_7() {
        //given
        int number = 5;
        String result = getResult(number);
        String target = "Buzz";
        //then
        assertEquals(target, result);
    }

    @Test
    public void should_return_whizz_when_divisible_by_7_but_not_3_not_5() {
        //given
        int number = 7;
        String result = getResult(number);
        String target = "Whizz";
        //then
        assertEquals(target, result);
    }
    @Test
    public void should_return_fizz_buzz_when_divisible_by_3_and_5_not_7() {
        //given
        int number = 15;
        String result = getResult(number);
        String target = "FizzBuzz";
        //then
        assertEquals(target, result);
    }
    @Test
    public void should_return_fizz_buzz_when_divisible_by_3_and_7_and_5() {
        //given
        int number = 21;
        String result = getResult(number);
        String target = "FizzBuzzWhizz";
        //then
        assertEquals(target, result);
    }
    @Test
    public void should_return_fizz_buzz_when_divisible_by_5_and_7_not_3() {
        //given
        int number = 35;
        String result = getResult(number);
        String target = "BuzzWhizz";
        //then
        assertEquals(target, result);
    }

    @Test
    public void should_return_fizz_buzz_when_divisible_by_3_and_5_and_7() {
        //given
        int number = 105;
        String result = getResult(number);
        String target = "FizzBuzzWhizz";
        //then
        assertEquals(target, result);
    }

    private static String getResult(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        return fizzBuzz.countOff(number);
    }


}
