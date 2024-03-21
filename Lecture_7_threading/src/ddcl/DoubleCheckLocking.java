package ddcl;

public class DoubleCheckLocking {
    public static class Singleton {
        Integer myValue;

        private Singleton() {
            myValue = (int) Math.round(100 * Math.random());
        }

        public String getValue() {
            return myValue.toString();
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
        new Thread(() -> {
            try {
                Thread.sleep(50);
                getInstance();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(100);
                System.out.println(getInstance().getValue());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
