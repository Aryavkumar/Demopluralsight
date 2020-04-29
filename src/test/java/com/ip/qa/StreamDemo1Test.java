package com.ip.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author QA Classes
 *
 */
public class StreamDemo1Test {
/**
 */
@Test
public void checkingWithLessthanGivenCondition() {
int[] l = {2, 3, 4, 5, 6, 10};
Assert.assertEquals(0, StreamDemo1.sumStream(l));
}
/**
 */
@Test
public void checkWithEmptyArray() {
int[] l = new int[0];
Assert.assertEquals(0, StreamDemo1.sumStream(l));
}
/**
 */
@Test
public void checkingWithGreaterThanGivenCondition() {
int[] l = {15,20,30,40};
Assert.assertEquals(105, StreamDemo1.sumStream(l));
}
@Test
public void checkingWithNegitiveNumbers() {
int[] l = {-10, -20, -30, -40};
Assert.assertEquals(0, StreamDemo1.sumStream(l));
}
@Test
public void checkingWithNegitiveAndPositiveNumbers() {
int[] l = {-15,-20,30,40};
Assert.assertEquals(70, StreamDemo1.sumStream(l));
}
@Test
public void checkforZeroPositiveNum() {
int[] l = {0,3,8,10,20,30};
Assert.assertEquals(50, StreamDemo1.sumStream(l));
}
@Test
public void checkforZeroNegNum() {
int[] l = {-15,-20,-50, -60, 0};
Assert.assertEquals(0, StreamDemo1.sumStream(l));
}
}
