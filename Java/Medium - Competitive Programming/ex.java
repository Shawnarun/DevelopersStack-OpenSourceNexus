/*
* Author : thushaonline
* Gmail : rajthusha99@gmail.com
* Date : 26.02.2024
* Description : Thread Class
*/

public class Ex {
public static class Thread1 extends Thread {
public void run() {
    System.out.println("A");
    System.out.println("B");
}
}
public static class Thread2 extends Thread {
public void run() {
    System.out.println("1");
    System.out.println("2");
}
}
public static void main(String[] args) {
    new Thread1().start();
    new Thread2().start();
}
}