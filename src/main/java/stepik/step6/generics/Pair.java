package stepik.step6.generics;

import java.util.Objects;

class Pair<X, Y> {

    X first;
    Y second;


    private Pair(X first, Y second) {

        this.first = first;
        this.second = second;
    }

    public X getFirst() {
        return first;
    }

    public Y getSecond() {
        return second;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    static <X, Y> Pair of(X first, Y second) {
        return new Pair(first, second);
    }
}
