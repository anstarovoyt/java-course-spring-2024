package covariance;

import generics.Ref;

public class Covariance {
    public static void main(String[] args) {
        Ref<String> refString = new Ref<>();
        refString.setValue("hello");

        Ref<? extends CharSequence> ref = refString;
        CharSequence value = ref.getValue();
//        ref.setValue("hello"); //error

    }
}
