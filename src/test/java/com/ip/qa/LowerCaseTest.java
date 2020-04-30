package com.ip.qa;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * @author QA Classes
 *
 */
public class LowerCaseTest {
/**
*/
LowerCase lc;
/**
*/
@BeforeTest
public void setUp() {
lc = new LowerCase();
}
/**
*/
@Test
public void testWithMultipleWords() {
List<String> input = Arrays.asList("HELLO", "ABC", "YFJ");
List<String> actual = lc.allToLowerCase(input);
List<String> expected = Arrays.asList("hello", "abc", "yfj");
Assert.assertEquals(expected, actual);
}
/**
*/
@Test
public void testWithLowerUpperwords() {
List<String> input = Arrays.asList("Aryav", "Sai", "kuMaR");
List<String> actual = lc.allToLowerCase(input);
List<String> expected = Arrays.asList("aryav", "sai", "kumar");
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithnumbersWords() {
List<String> input = Arrays.asList("HELLO", "ABC", "67");
List<String> actual = lc.allToLowerCase(input);
List<String> expected = Arrays.asList("hello", "abc", "67");
Assert.assertEquals(expected, actual);
}
/**
*/
@Test
public void testWithNumbers() {
List<String> input = Arrays.asList("12334", "12", "567");
List<String> actual = lc.allToLowerCase(input);
List<String> expected = Arrays.asList("12334", "12", "567");
Assert.assertEquals(expected, actual);
}
/**
*/
@Test
public void testWithLowerCase() {
List<String> input = Arrays.asList("abc", "bca", "def");
List<String> actual = lc.allToLowerCase(input);
List<String> expected = Arrays.asList("abc", "bca", "def");
Assert.assertEquals(expected, actual);
}
/**
*/
@Test
public void testWithEmpy() {
List<String> input = Arrays.asList("abc", "bca", "def");
List<String> actual = lc.allToLowerCase(input);
List<String> expected = Arrays.asList("abc", "bca", "def");
Assert.assertEquals(expected, actual);
}

}

