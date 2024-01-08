package tlaw;

public class App {
    public static void main(String[] args) {
        Task taskRunner = new Task();
        taskRunner.start();
        System.out.println("Hello, World!");

    }

    static class Task extends Thread {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Number: " + i);
            }
        }
    }
}