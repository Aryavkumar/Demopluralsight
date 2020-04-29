package com.ip.qa;
import java.util.function.BinaryOperator;
/**
 * @author QA Classes
 *
 */
public class BOperator {
/**
 * @param args
 */
public static void main(final String[] args) {
BOperator.additionTwoNum(1, 2);
}
/**
 * @param num1
 * @param num2
 * @return tag.
 */
public static Integer additionTwoNum(final int num1, final int num2) {
BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
return func2.apply(num1, num2);
}
}
