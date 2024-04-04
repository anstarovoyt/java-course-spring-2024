package comparable;

import java.util.Comparator;

public class Configuration implements Comparable<Configuration> {
    String host;
    int port;

    public Configuration(String host, int port) {
        this.port = port;
        this.host = host;
    }


    @Override
    public int compareTo(Configuration o) {
        return host.compareTo(o.host);
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
