package cloneable;

public class Configuration implements Cloneable {
    String host;
    int port;

    public Configuration(String host, int port) {
        this.port = port;
        this.host = host;
    }

    @Override
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
