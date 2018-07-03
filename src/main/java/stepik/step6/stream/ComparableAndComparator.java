package stepik.step6.stream;

import java.util.*;

public class ComparableAndComparator {

    interface Human {

    }

    static class Programmer implements Human, Comparable<Programmer> {

        String name;
        int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Programmer(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Programmer o) {
            return Comparator.comparing(Programmer::getAge)
                    .thenComparing(Programmer::getName)
                    .compare(this, o);
        }
    }

    static class Worker implements Human {

    }

    public static void main(String[] args) {

        List<Human> list = new ArrayList<>();
        list.add(new Programmer("A", 1));

        Set<Programmer> humans = new TreeSet<>();
        humans.add(new Programmer("C", 3));
        humans.add(new Programmer("B", 2));
        humans.add(new Programmer("B", 5));
        humans.add(new Programmer("A", 5));


        for(Programmer p: humans) {
            System.out.println(p.name + " " + p.age);
        }

    }
}
