package stepik.step6.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.parseString(main.readFromSystemIn());
    }

    public String readFromSystemIn() {

        String string;
        String result = "";
        // StringBuilder builder = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, UTF_8))) {
            while ((string = reader.readLine()) != null) {
                result += string;
            }
            //string = builder.toString();
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }


        return result;
    }

    public void parseString(String string) {

        List<String> myList = new ArrayList<>(Arrays.asList(string.replaceAll("[^A-Za-zА-Яа-я0-9]+", " ").split(" ")));
        Map<String, Integer> resultMap = myList.stream()
                .map(String::toLowerCase)
                .collect(HashMap::new,
                        (map, word) -> {
                            if (map.containsKey(word))
                                map.put(word, map.get(word) + 1);
                            else
                                map.put(word, 1);
                        },
                        HashMap::putAll);
        resultMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .forEach(x -> System.out.println(x.toString().replaceAll("[^A-Za-zА-Яа-я)]+", "")));
    }
}
