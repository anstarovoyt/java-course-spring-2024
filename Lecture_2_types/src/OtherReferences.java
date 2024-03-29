import java.lang.ref.WeakReference;

public class OtherReferences {
    public static void main(String[] args) {
        var stringBuilderWeakReference = createRef();
        printRef(stringBuilderWeakReference);
    }

    private static WeakReference<StringBuilder> createRef() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(42);
        return new WeakReference<>(stringBuilder);
    }

    private static void printRef(WeakReference<StringBuilder> stringBuilderWeakReference) {
        System.gc();
        System.gc();
        System.out.println(stringBuilderWeakReference.get());
    }
}
