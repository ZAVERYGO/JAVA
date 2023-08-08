package com.Generics;

public final class PairUtil {
    private PairUtil() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> value) {
        V value2 = value.getValue2();
        K value1 = value.getValue1();
        return new Pair<>(value2, value1);
    }
}
