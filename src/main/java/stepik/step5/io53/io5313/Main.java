package stepik.step5.io53.io5313;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        System.out.format("%.6f", main.sum());
    }

    public double sum() {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        while (scanner.hasNext()) {
            try {
                d += Double.parseDouble(scanner.next());
            } catch (NumberFormatException x) {
                continue;
            }
        }
        return d;
    }
}
