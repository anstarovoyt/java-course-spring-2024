package contravariance;

import generics.Ref;

public class Contravariance {
    public static void main(String[] args) {
        Ref<CharSequence> refString = new Ref<>();
        refString.setValue("hello");

        Ref<? super String> ref = refString;
        ref.setValue("hello2");

//        String value = ref.getValue(); //error
    }
}
