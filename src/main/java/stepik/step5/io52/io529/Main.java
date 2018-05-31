package stepik.step5.io52.io529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().readSystemIn();
    }

    public void readSystemIn() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int now = br.read();
        int next;
        while (now > -1) {
            next = br.read();
            if (now == 13 && next == 10) {
                now = next;
                continue;
            } else {
                System.out.write(now);
                now = next;
            }
        }
        System.out.flush();
    }
}
