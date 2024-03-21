package ddcl;

public class DoubleCheckLocking {
    public static class Singleton {
        Integer myValue;

        private Singleton() {
            myValue = (int) Math.round(100 * Math.random());
        }

        public String getValue() {
            return Integer.toString(myValue);
        }
    }

    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println(getInstance().getValue());
        });

        new Thread(() -> {
            getInstance();
        }).start();
        thread1.start();
    }
}
