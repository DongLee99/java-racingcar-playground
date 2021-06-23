package Util;

import org.junit.jupiter.api.Test;

public class RandomNumberTest {
    @Test
    public void 랜덤_수() {
        int result = RandomNumber.getRandomNumber(10);
        if (result > 10) {
            throw new IllegalArgumentException("에ㅓㄹ");
        }
    }
}
