package com.ip.qa;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author QA Classes
 *
 */
public class BOperatorTest {
/**
*/
@Test
public void testTwoNum() {
Integer actual = BOperator.additionTwoNum(2, 3);
Integer expected = 5;
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testTwoNegNum() {
Integer actual = BOperator.additionTwoNum(-2, -3);
Integer expected = -5;
Assert.assertEquals(actual, expected);
}
/**
 */
@Test
public void testOneNegNum() {
Integer actual = BOperator.additionTwoNum(-2, 3);
Integer expected = 1;
Assert.assertEquals(actual, expected);
}
/**
 */
@Test
public void testWithZero() {
Integer actual = BOperator.additionTwoNum(90, 0);
Integer expected = 90;
Assert.assertEquals(actual, expected);
}
/**
 */
@Test
public void testWithZeroNegitiveNum() {
Integer actual = BOperator.additionTwoNum(-90, 0);
Integer expected = -90;
Assert.assertEquals(actual, expected);
}

/**
 */
@Test
public void testWithLargeNumbers() {
Integer actual = BOperator.additionTwoNum(1234, 4321);
Integer expected = 5555;
Assert.assertEquals(actual, expected);
}
/**
 */
@Test
public void testWithBothZeros() {
Integer actual = BOperator.additionTwoNum(0, 0);
Integer expected = 0;
Assert.assertEquals(actual, expected);
}
}
