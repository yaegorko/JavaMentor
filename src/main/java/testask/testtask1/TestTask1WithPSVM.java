package testask.testtask1;

import java.util.Scanner;

public class TestTask1WithPSVM {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String string = scan.nextLine();
        int numberOfCharacters = string.length();
        System.out.println(numberOfCharacters);
        System.out.println(string + "Java");
    }
}
