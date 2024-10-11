import java.util.*;

public class Main extends Thread {

    public static void main (String [] args) throws InterruptedException {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Name your first Thread: ");
        Thread thread1 = new Thread (new MyRunnable(), sc.nextLine());
        System.out.println("Enter Name your second Thread: ");
        Thread thread2 = new Thread (new MyRunnable(), sc.nextLine());

        System.out.println(thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());

        System.out.println("\nStarting the Threads... ");
        thread1.start();
        thread2.start();

        Thread.sleep(500);

        System.out.println("\nAfter Sleep... ");
        System.out.println(thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());

    }
}

class MyRunnable implements Runnable {
    @Override

    public void run (){
        System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().getState());
        
        try { 
            Thread.sleep(500);
        } catch ( InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//Sean :) BSIT 201 