package com.ip.qa;
/**
 * @author QA Classes
 *
 */
public class RunnableWithLambda {
 /**
 * @param args
 */
public static void main(final String[] args) {
Runnable runnable = new Runnable() {

@Override
public void run() {
// TODO Auto-generated method stub
System.out.println("Hi");
}
};
new Thread(runnable).start();
//Using Lambdas
Runnable runnable1 = () -> System.out.println("Hello");
new Thread(runnable1).start();
}
}


