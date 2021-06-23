package Domain;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CarsTest {

    @Test
    public void Cars_객체() {
        Cars cars = new Cars(Arrays.asList(new Car("동현"), new Car("정윤")));
    }

    @Test
    public void Cars_duplication() {
        Cars cars = new Cars(Arrays.asList(new Car("동현"), new Car("정윤"), new Car("동현")));
        //Boolean result = cars.validation(Arrays.asList(new Car("동현"), new Car("정윤"), new Car("동현")));
        //assertThat(result).isEqualTo(false);
    }

    @Test
    public void Cars_play(){
        Cars cars = new Cars(Arrays.asList(new Car("동현"), new Car("정윤"), new Car("동현")));
        cars.play(5);
    }
}
