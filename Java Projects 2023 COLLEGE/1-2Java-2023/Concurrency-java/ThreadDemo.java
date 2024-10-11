public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.start();
        System.out.println("Outside of a thread");
    }

    public void run() {
        System.out.println("Running in a thread");
    }
}
