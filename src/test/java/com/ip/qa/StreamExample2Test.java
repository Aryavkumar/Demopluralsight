package com.ip.qa;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * @author QA Classes
 *
 */
public class StreamExample2Test {
/**
 */
@Test
public void testWithNoneMatch() {
String[] str = {"TUJAES", "SDK"};
Assert.assertEquals(false, StreamExample2.addTest(str));
}
/**
 */
@Test
public void testWithAnyMatch() {
String[] str = {"ABC", "BCD"};
Assert.assertEquals(true, StreamExample2.addTest(str));
}
/**
 */
@Test
public void  testWithNullString() {
String[] str = null;
Assert.assertFalse(StreamExample2.addTest(str));
}
/**
*/
@Test
public void testWithEmptyString() {
String[] str = new String[0];
Assert.assertEquals(false, StreamExample2.addTest(str));
}
@Test
public void testWithMultipleMatches() {
String[] str = {"SDH", "CSH", "ABC", "ABCD"};
Assert.assertEquals(true, StreamExample2.addTest(str));
}
}
