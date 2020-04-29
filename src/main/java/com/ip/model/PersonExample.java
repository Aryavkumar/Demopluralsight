package com.ip.model;



import java.util.Arrays;
import java.util.List;

/**
 * @author QA Classes
 *
 */
public class PersonExample {
/**
 * @param args
 */
public static void main(final String[] args) {
List<Person> personlist = Arrays.asList(new Person(1, "ram", 25),
new Person(2, "sai", 34),
new Person(3, "pratap", 43),
new Person(4, "petter", 33),
new Person(5, "steve", 65));
Person person = personlist.stream()
.filter(x -> "petter".equals(x.getName())
&& 33 == x.getAge())//we want petter with age 33 inly
.findAny().orElse(null);
System.out.println(person);
}
}
