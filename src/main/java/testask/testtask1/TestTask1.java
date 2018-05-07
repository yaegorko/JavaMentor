package testask.testtask1;

import java.util.Scanner;

public class TestTask1 {

    private Scanner scan;
    private String string;
    private int numberOfCharacters;

    public String readString() {
        scan = new Scanner(System.in);
        return this.string = this.scan.nextLine();
    }

    public int determineNumberOfCharacters(String string){
        return this.numberOfCharacters = string.length();
    }

    public void printResults() {
        System.out.println(this.numberOfCharacters);
        System.out.println(this.string + "Java");
    }
}
