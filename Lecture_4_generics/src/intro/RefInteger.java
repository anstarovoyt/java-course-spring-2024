package intro;

public class RefInteger {
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

class MainInteger {
    public static void main(String[] args) {
        RefInteger ref = new RefInteger();
        ref.setValue(123);

        Integer stored = ref.getValue();
        System.out.println(stored);
    }
}
