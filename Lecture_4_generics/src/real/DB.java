package real;

import java.util.function.Supplier;

public class DB {
    public void connect(Supplier<? extends CharSequence> supplier) {
        CharSequence host = supplier.get();
        //logic to connect
    }
}
