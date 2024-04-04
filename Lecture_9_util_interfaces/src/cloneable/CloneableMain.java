package cloneable;

public class CloneableMain {
    public static final Configuration config
            = new Configuration("localhost", 3000);

    public static void main(String[] args) {
//        Configuration newConfig = new Configuration(config.host, config.port);
        Configuration newConfig = (Configuration) config.clone();
        newConfig.port = 100;

        System.out.println(newConfig.host + ":" + newConfig.port);
    }
}
