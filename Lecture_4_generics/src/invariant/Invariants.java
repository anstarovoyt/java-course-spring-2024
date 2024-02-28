package invariant;

import generics.Ref;

public class Invariants {
    public static void main(String[] args) {
        Ref<CharSequence> refCharSequence = new Ref<>();
        refCharSequence.setValue("hello1");

        Ref<String> refString = new Ref<>();
        refString.setValue("hello2");
//        refCharSequence = refString; //error
//        refString = refCharSequence; //error
    }
}
