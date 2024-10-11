public class ThreadDemo1 implements Runnable {
    public static void main(String[] args) {
        ThreadDemo obj = new ThreadDemo();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Outside of a thread");
    }

    public void run() {
        System.out.println("Running in a thread");
    }
}
