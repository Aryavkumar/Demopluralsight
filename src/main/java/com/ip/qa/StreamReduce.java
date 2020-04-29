package com.ip.qa;

import java.util.ArrayList;
/**
 * @author QA Classes
 *
 */
public class StreamReduce {
/**
 * @param args
 */
public static void main(final String[] args) {

int[] num = {1, 2, 3, 4};
StreamReduce.totalSum(num);
}

/**
 * @param num
 * @return tag.
 */
public static int totalSum(final int[] num) {
ArrayList<Integer> arraylist = new ArrayList<Integer>();
for (int i : num) {
arraylist.add(i);
}
int sum = arraylist.stream().reduce(0,
(element1, element2) -> element1 + element2);
return sum;
}



}
