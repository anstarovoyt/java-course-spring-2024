package intro;

public class RefString {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Main {
    public static void main(String[] args) {
        RefString refString = new RefString();
        refString.setValue("hello");

        String stored = refString.getValue();
        System.out.println(stored);
    }
}
