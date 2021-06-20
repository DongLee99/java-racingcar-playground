package Domain;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        validation(name);
        this.name = name;
        this.position = 0;
    }

    private void validation(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("에러 : 길이가 5 이상");
        }
    }
}
