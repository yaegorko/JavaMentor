package stepik.step6.collections;

import java.util.HashSet;
import java.util.Set;

public class Difference {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> firstSet = new HashSet<>(set1);
        Set<T> secondSet = new HashSet<>(set2);
        firstSet.removeAll(secondSet);
        secondSet.removeAll(set1);
        firstSet.addAll(secondSet);

        return firstSet;
    }
}
