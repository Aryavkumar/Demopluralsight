package com.ip.qa;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * @author QA Classes
 *
 */
public class StreamExample3Test {
/**
*/
@Test
public void testWithPrime() {
Assert.assertEquals(true, StreamExample3.isPrime(5));
}
/**
*/
@Test
public void testWithNotPrime() {
Assert.assertEquals(false, StreamExample3.isPrime(6));
}
/**
*/
@Test
public void testWithZero() {
Assert.assertEquals(false, StreamExample3.isPrime(0));
}
/**
*/
@Test
public void testWithLargeNumber() {
Assert.assertEquals(false, StreamExample3.isPrime(97));
}
/**
*/
@Test
public void testWithNegitiveNumber() {
Assert.assertEquals(false, StreamExample3.isPrime(-5));
}
}
