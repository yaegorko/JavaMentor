package stepik.step6.stream;

import java.util.stream.IntStream;


public class RandomStream {

    public static IntStream pseudoRandomStream(int seed) {

        IntStream intStream = IntStream.iterate(seed, x -> x * x % 10000 / 10);

        return intStream;
    }

    public int testMethod(int x) {

        x = x * x % 10000 / 10;
        System.out.println(x);
        return x;

    }
}
