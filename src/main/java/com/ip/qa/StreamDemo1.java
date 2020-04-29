package com.ip.qa;

import java.util.ArrayList;
/**
 * @author QA Classes
 *
 */
public class StreamDemo1 {
/**
* @param args
*/
public static void main(final String[] args) {
// TODO Auto-generated method stub
int[] l = {1, '2', '3', '4', '5', 10 };
StreamDemo1.sumStream(l);
}
/**
* @param l
* @return tag.
*/
public static int sumStream(final int[] l) {
ArrayList<Integer> arraylist = new ArrayList<Integer>();
for (int i : l) {
arraylist.add(i);
}
return arraylist.stream().filter(i -> i > 10)
.mapToInt(i -> i).sum();
}
}
