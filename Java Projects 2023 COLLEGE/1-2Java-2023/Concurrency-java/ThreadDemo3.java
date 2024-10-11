public class ThreadDemo3 extends Thread {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        t1.start();
        try {
            t1.join(2000); // Starts t2 after 2 seconds or if t1 is dead
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-0 is alive: " + t1.isAlive());
        System.out.println("Thread-1 is alive: " + t2.isAlive());
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
        try {
            Thread.sleep(3000); // Suspends thread for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has ended.");
    }
}
