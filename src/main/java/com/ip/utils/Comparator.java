package com.ip.utils;
@FunctionalInterface
public interface Comparator<T> {
int compare(T t1, T t2);
default Comparator<T> thenComparing(Comparator<T> cmp) {

    return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2)
    : compare(p1, p2);
}
}

