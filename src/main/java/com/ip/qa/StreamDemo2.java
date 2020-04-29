package com.ip.qa;
import java.util.ArrayList;
/**
 * @author QA Classes
 *
 */
public class StreamDemo2 {
 /**
 * @param args
 */
public static void main(final String[] args) {
int[] l = {1, 2, '3' };
   StreamDemo2.multiples(l);
}
/**
* @return tag for l.
*/
public static boolean multiples(final int[] l) {
ArrayList<Integer> arraylist = new ArrayList<Integer>();
for (int i:l) {
arraylist.add(i);
}
boolean k = arraylist.stream().anyMatch(i -> i % '3' == 0);
return k;
}
}
