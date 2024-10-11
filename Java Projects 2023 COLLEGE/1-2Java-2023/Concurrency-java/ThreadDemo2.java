public class ThreadDemo2 extends Thread {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        ThreadDemo t3 = new ThreadDemo();

        t1.setName("One");
        t2.setName("Two");
        t3.setName("Three");
        t1.setPriority(4);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(8);
        t1.start();
        t2.start();
        t3.start();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}
