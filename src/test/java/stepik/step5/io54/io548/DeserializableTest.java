package stepik.step5.io54.io548;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DeserializableTest {

    Animal animal = new Animal("Cat");
    Animal animal2 = new Animal("Dog");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos;
    Animal[] animals;

    {
        try {
            oos = new ObjectOutputStream(baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenWriteAnimal() throws IOException {
        oos.writeInt(1);
        oos.writeObject(animal);
        byte[] animalsByte = baos.toByteArray();
        oos.flush();
        oos.close();
        animals = Deserializable.deserializeAnimalArray(animalsByte);
        assertThat(animals[0].getName(), is("Cat"));
    }

    @Test
    public void whenWriteTwoAnimals() throws IOException {
        animals = new Animal[]{animal, animal2};
        oos.writeInt(animals.length);
        oos.writeObject(animal);
        oos.writeObject(animal2);
        byte[] animalsByte = baos.toByteArray();
        animals = Deserializable.deserializeAnimalArray(animalsByte);
        assertThat(animals[0].getName(), is("Cat"));
        assertThat(animals[1].getName(), is("Dog"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenWriteDouble() throws IOException {
        Double d = Double.parseDouble("2");
        oos.writeObject(d);
        byte[] doubleByte = baos.toByteArray();
        oos.flush();
        oos.close();
        animals = Deserializable.deserializeAnimalArray(doubleByte);
    }


}