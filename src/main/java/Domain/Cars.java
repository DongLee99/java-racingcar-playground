package Domain;

import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Boolean validation(List<Car> asList) {
        if (asList.size() != (int) asList.stream()
                                            .distinct()
                                            .count()) {
            throw new IllegalArgumentException("에러 : 중복 발생");
        }
        return true;
    }
}
