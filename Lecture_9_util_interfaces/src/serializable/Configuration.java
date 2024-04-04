package serializable;

import java.io.Serial;
import java.io.Serializable;

public class Configuration implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    String host;
    int port;

    public Configuration(String host, int port) {
        this.port = port;
        this.host = host;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
