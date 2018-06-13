package stepik.step6.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.method();
    }

    public void method() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        List<String> items = Arrays.asList(string.split(" "));
        for (int i = 0; i < items.size(); i++) {
            items.remove(i);
        }
    }

}
