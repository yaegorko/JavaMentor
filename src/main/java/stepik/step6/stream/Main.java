package stepik.step6.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    private Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.parseString(main.readFromSystemIn());
    }

    public Map<String, Integer> readFromSystemIn() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, UTF_8))) {
            resultMap = reader.lines()
                    .map(String::toLowerCase)
                    .flatMap(s -> Stream.of(s.replaceAll("[^a-zа-яё0-9]+", " ")))
                    .flatMap(s -> Stream.of(s.split(" ")))
                    .filter(s -> !"".equals(s))
                    .collect(HashMap::new,
                            (map, word) -> {
                                if (map.containsKey(word)) {
                                    map.put(word, map.get(word) + 1);
                                } else {
                                    map.put(word, 1);
                                }
                            },
                            HashMap::putAll);
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }
        return resultMap;
    }

    public void parseString(Map<String, Integer> map) {
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(x -> System.out.printf("%s%n", x));
    }
}
