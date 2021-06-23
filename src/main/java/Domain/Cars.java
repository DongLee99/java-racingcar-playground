package Domain;

import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        duplicateValidation(cars);
        this.cars = cars;
    }

    public void play(int count) {
        while(count > 0) {
            cars.stream()
                    .forEach(Car::movePosition);
            count--;
        }
    }

    private void duplicateValidation(List<Car> carList) {
        int distinctCount = (int) carList.stream()
                                        .distinct()
                                        .count();
        if (carList.size() != distinctCount){
            throw new IllegalArgumentException("에러 : 중복 발생");
        }
    }
}
