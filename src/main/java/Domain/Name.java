package Domain;

public class Name {
    private final String name;

    public Name(String name) {
        validation(name);
        this.name = name;
    }

    private void validation(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("에러 : 길이가 5 이상");
        }
    }
}
