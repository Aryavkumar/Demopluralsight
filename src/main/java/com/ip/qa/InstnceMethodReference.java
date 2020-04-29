package com.ip.qa;
import java.util.function.BiFunction;
/**
 * @author QA Classes
 *
 */
class Arithmetic {
/**
 * @param a
 * @param b
 * @return tag.
 */
public int add(final int a, final int b) {
return a + b;
}
public static class InstnceMethodReference {
/**
* @param args
*/
public static void main(final String[] args) {
BiFunction<Integer, Integer, Integer> adder = new Arithmetic()::add;
int result = adder.apply(10, 20);
System.out.println(result);
}
}
}
