package com.ip.qa;
import java.util.ArrayList;
/*
 * @author QA Classes
 *
 */
public class StreamExample2 {
/**
 * @param str
 * @return tag.
 */
public static boolean addTest(final String[] str) {
ArrayList<String> arraylist = new ArrayList<String>();
for (String str1:str) {
arraylist.add(str1);
}
boolean all = arraylist.stream().anyMatch((a) -> a
.startsWith("A"));
return all;
}
/**
* @param args
*/
public static void main(final String[] args) {
// TODO Auto-generated method stub
String[] str = {"DTRDR", "RDCRYF"};
StreamExample2.addTest(str);
}
}
