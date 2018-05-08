package testask.testtask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOfEven {
    private int[] arrayOfNumbers;

    public int[] getArrayOfNumbers() {
        return arrayOfNumbers;
    }

    public void readNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] splitStringArray = line.split(",");
        arrayOfNumbers = new int[splitStringArray.length];
        for (int i = 0; i < splitStringArray.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(splitStringArray[i]);
        }
    }

    public void printEven() {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] != 0 && arrayOfNumbers[i] % 2 == 0) {
                System.out.println(arrayOfNumbers[i]);
            }
        }
    }
}
