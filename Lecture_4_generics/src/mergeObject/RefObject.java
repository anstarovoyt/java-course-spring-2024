package mergeObject;

public class RefObject {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

class Main {
    public static void main(String[] args) {
        RefObject refObject = new RefObject();
        refObject.setValue("hello");

        String stored = (String) refObject.getValue();
        System.out.println(stored);
    }
}
