package InterviewQ;

public class MultiTHreadingExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new Task("Thread 1"));
        Thread thread2 = new Thread(new Task("Thread 2"));

        // Start the threads
        thread1.start();
        thread2.start();
    }

    // A simple task that prints numbers from 1 to 5
    static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + ": " + i);
                try {
                    // Introduce a short delay to simulate work
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

