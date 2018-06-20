package stepik.step6.stream;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class FindMinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        T[] t = (T[]) stream.sorted(order).toArray();

        if (t.length == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(t[0], t[t.length - 1]);
        }

    }
}
