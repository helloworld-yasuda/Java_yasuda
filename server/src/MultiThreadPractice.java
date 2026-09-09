public class MultiThreadPractice {

    static class HelloThread extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, World!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        HelloThread thread = new HelloThread();
        thread.start();
    }
}
