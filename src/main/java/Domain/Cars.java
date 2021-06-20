package Domain;

import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        validation(cars);
        this.cars = cars;
    }

    private void validation(List<Car> carList) {
        int carCount = (int) carList.stream()
                                        .distinct()
                                        .count();
        if (carList.size() != carCount){
            throw new IllegalArgumentException("에러 : 중복 발생");
        }
    }
}
