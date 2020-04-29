package com.ip.qa;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @author QA Classes
 *
 */
public class LowerCase {
/**
 * @param words
 * @return tag.
 */
public final List<String> allToLowerCase(final List<String> words) {
return words.stream().map(string
-> string.toLowerCase()).collect(Collectors.toList());
}
}
