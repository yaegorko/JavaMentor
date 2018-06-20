package stepik.step6.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public String readFromSystemIn() {

        String string;
        StringBuilder builder = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, UTF_8))) {
            while ((string = reader.readLine()) != null) {
                builder.append(string);
            }
        } catch (NullPointerException | IOException e) {

        }
        return builder.toString();
    }

    public void parseString(String string) {
        IntStream stream = string.codePoints();
      List<String> result = stream.map(s -> s.startWith()).toArray();
        System.out.println(stream);
    }
}
