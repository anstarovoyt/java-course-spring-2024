package serializable;

import java.io.*;

public class SerializableMain {

    public static final String FILE_NAME = "UserSettings.ser";

    public static Configuration deserializeSettings(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Configuration) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void serializeSettings(Configuration settings, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(settings);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Configuration settings = new Configuration("localhost", 3000);
        serializeSettings(settings, FILE_NAME);
        Configuration loadedSettings = deserializeSettings(FILE_NAME);
        System.out.println(loadedSettings);
    }
}
