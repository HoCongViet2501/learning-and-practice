package multithread;

public class BasicDemo extends Thread {
    @Override
    public void run() {
        System.out.println();
        for (int x = 1; x <= 3; x++) {
            System.out.println(x + "thread name: " + Thread.currentThread().getName());
        }
    }
}
