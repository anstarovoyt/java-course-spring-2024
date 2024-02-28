package abstractInterface;

public interface LoggerInterface {
    boolean IS_CREATED = true; // static final

    void log(String message); // public by default
}

abstract class LoggerAbstract {
    public abstract void logPublic(String message);

    protected abstract void logProtected(String message);

    abstract void logPackagePrivate(String message); // package-private by default

    private void logPrivate(String message) {
        System.out.println(message);
    }

    private final boolean isCreated = true;

    public LoggerAbstract() {
        System.out.println("Constructed");
    }
}


