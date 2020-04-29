package com.ip.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @author QA Classes
 *
 */
public class CompareExample {
/**
* @param args
*/
public static void main(final String[] args) {
int[] k = {1, 3, 4, 5};
CompareExample.sorting(k);
}


/**
 * @param k
 * @return tag.
 */
public static  Integer sorting(final int[] k) {
ArrayList<Integer> arraylist = new ArrayList<Integer>();
for (int i:k) {
arraylist.add(i);
}
Comparator<Integer> com = (i1, i2) -> i1.compareTo(i2);
 arraylist.stream().sorted(com)
.collect(Collectors.toList());
Integer max = arraylist.stream().max(com).get();
return max;
}
}
