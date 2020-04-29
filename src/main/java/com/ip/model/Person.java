package com.ip.model;

/**
 * @author QA Classes
 *
 */
public class Person {
/**
*/
private int id;
/**
*/
private String name;
/**
*/
private int age;
/**
 * @param id
 * @param name
 * @param age
 */
public Person(final int id, final String name, final int age) {
super();
this.id = id;
this.name = name;
this.age = age;
}
/**
 * @return tag.
 */
public int getId() {
return id;
}
/**
 * @param id
 */
public void setId(final int id) {
this.id = id;
}
/**
 * @return tag.
 */
public String getName() {
return name;
}
/**
 * @param name
 */
public void setName(final String name) {
this.name = name;
}
/**
 * @return tag.
 */
public int getAge() {
return age;
}
/**
 * @param age
 */
public void setAge(final int age) {
this.age = age;
}
@Override
public String toString() {
return "Person [id=" + id + ", name=" + name + ", age =" + age + "]";
}

}
