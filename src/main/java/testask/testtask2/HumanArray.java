package testask.testtask2;

public class HumanArray {

    private Human[] humans = new Human[10];

    public Human[] getHumans() {
        return humans;
    }

    public void createHumanArray() {
        for (int i = 0; i < 10; i++) {
            humans[i] = new Human(i, "name" + i);
        }
    }

    public void humanSayHello() {
        for (int i = 0; i < humans.length; i++) {
            humans[i].sayHello();
        }
    }
}
