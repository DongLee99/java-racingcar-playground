package Domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class CarTest {

    @Test
    public void Car_객체() {
        Car car = new Car("동현");
        Boolean result = Car.validation("동현");
        assertThat(result).isEqualTo(false);
    }
}
