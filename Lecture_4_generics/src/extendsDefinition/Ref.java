package extendsDefinition;


public class Ref
        <T extends CharSequence> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class MainExDef {
    public static void main(String[] args) {
        Ref<String> ref = new Ref<>();
        ref.setValue("hello");
        System.out.println(ref.getValue());

//        Ref<Number> ref = new Ref<>(); //error
    }
}
