package Domain;

import Util.RandomNumber;

public class Car {
    private final static int BOUNDARY = 10;
    private final Name name;
    private int position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = 0;
    }

    public void movePosition() {
        if (RandomNumber.getRandomNumber(BOUNDARY) > 3) {
            position++;
        }
    }
}
