package testask.testtask1;

import java.util.Scanner;

public class TestTask1 {

    private Scanner scan;
    private String string;
    private int numberOfCharacters;

    public String readString() {
        this.scan = new Scanner(System.in);
        this.string = this.scan.nextLine();
        return this.string;
    }

    public int determineNumberOfCharacters(String string) {
        this.numberOfCharacters = string.length();
        return this.numberOfCharacters;
    }

    public void printResults() {
        System.out.println(this.numberOfCharacters);
        System.out.println(this.string + "Java");
    }
}
