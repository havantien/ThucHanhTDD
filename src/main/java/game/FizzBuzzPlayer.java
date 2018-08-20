package game;

public class FizzBuzzPlayer {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String answer(int number) {
        if (isFizz(number)) {
            return FIZZ;
        } else if (isBuzz(number)) {
            return BUZZ;
        }
        return normalAnswer(number);
    }

    private static boolean isFizz(int number) {
        return number == 3;
    }

    private static boolean isBuzz(int number) {
        return number == 5;
    }

    private static String normalAnswer(int number) {
        return String.valueOf(number);
    }
}
