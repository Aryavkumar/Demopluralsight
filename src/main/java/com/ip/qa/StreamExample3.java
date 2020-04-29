package com.ip.qa;

import java.util.stream.IntStream;

/**
 * @author QA Classes
 *
 */
public class StreamExample3 {
/**
 * @param args
 */
public static void main(final String[] args) {
StreamExample3.isPrime(5);
}
/**
 * @param number
 * @return tag.
 */
public static boolean isPrime(final int number) {
return number > 1
&& IntStream.range(2, number).noneMatch(
index -> number % index == 0);
}
}
