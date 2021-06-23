package Util;

import java.util.Random;

public class RandomNumber {
    private static final Random random = new Random();

    private RandomNumber() {
    };

    public static int getRandomNumber(int boundary) {
        return random.nextInt(boundary);
    }

}
