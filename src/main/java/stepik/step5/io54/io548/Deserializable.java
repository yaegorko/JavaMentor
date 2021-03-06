package stepik.step5.io54.io548;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Deserializable {

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int length = ois.readInt();
            Animal[] animals = new Animal[length];
            for (int i = 0; i < animals.length; i++) {
                animals[i] = (Animal) ois.readObject();
            }
            return animals;
        } catch (ClassCastException | ClassNotFoundException | IOException ex) {
            throw new IllegalArgumentException();
        }
    }
}
