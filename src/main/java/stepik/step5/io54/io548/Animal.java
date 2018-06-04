package stepik.step5.io54.io548;

import java.io.Serializable;
import java.util.Objects;

class Animal implements Serializable {
    public String getName() {
        return name;
    }

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}