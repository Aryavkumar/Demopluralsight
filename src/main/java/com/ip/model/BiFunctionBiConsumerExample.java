package com.ip.model;


import java.util.function.*;

import java.util.ArrayList;
/**
 * @author QA Classes
 *
 */
class BiFunctionBiConsumerExample {
public static void main(final String[] args) {
ArrayList<Employee> emp = new ArrayList<>();
BiFunction<String, Double, Employee> f = (name, salary) ->
new Employee(name, salary);
emp.add(f.apply("sai", 10000.0));
emp.add(f.apply("kumar", 20000.0));
emp.add(f.apply("prasad", 30000.0));
BiConsumer<Employee, Double> c = (e, increment) ->
e.salary = e.salary + increment;
for (Employee e : emp) {
c.accept(e, 500.0);
}
for (Employee e : emp) {
System.out.println("Employee name:" + e.name);
System.out.println("Employee salary:" + e.salary);
}
}
}



