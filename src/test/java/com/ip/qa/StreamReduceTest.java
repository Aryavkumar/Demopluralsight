package com.ip.qa;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * @author QA Classes
 *
 */
public class StreamReduceTest {
/**
*/
@Test
public void testWithAllPositiveNumbers() {
int[] num = {1,2,3,4};
int actual = StreamReduce.totalSum(num);
int expected = 10;
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithAllNegitiveNumbers() {
int[] num = {-1, -2, -3, -4};
int actual = StreamReduce.totalSum(num);
int expected = -10;
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithPositiveAndNegitiveNumbers() {
int[] num = {-1, -3, -5, 3, 4, 6};
int actual = StreamReduce.totalSum(num);
int expected = 4;
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithEmptyString() {
int[] num = new int[0];
int actual = StreamReduce.totalSum(num);
int expected = 0;
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithZero() {
int[] num = {0, 4, 5, 9};
int actual = StreamReduce.totalSum(num);
int expected = 18;
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithZeroAndNegitiveNumbers() {
int[] num = {0, -4, -5, -9};
int actual = StreamReduce.totalSum(num);
int expected = -18;
Assert.assertEquals(actual, expected);
}
}
