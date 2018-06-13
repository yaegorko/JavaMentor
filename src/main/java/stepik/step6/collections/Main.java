package stepik.step6.collections;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, NullPointerException {

        Iterator iterator = readAndSort().descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static ArrayDeque readAndSort() throws IOException, NullPointerException {
        ArrayDeque arrayDeque = new ArrayDeque();
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            Scanner input = new Scanner(scanner.nextLine());
            int element;
            int count = 1;
            while (input.hasNextInt()) {
                element = input.nextInt();
                if (count % 2 == 0) {
                    arrayDeque.add(element);
                }
                count++;
            }
            return arrayDeque;
        } else {
            return arrayDeque;
        }
    }
}
