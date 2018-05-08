package testask.testtask2;

public class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void sayHello() {
        System.out.println(name + " hello!");
    }
}