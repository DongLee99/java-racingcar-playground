package Domain;

public class Car {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public static Boolean validation(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("에러 : 길이가 5 이상");
        }
        return true;
    }
}
