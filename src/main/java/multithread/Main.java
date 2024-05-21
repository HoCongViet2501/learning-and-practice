package multithread;

public class Main {
    public static void main(String[] args) {
        BasicDemo t1 = new BasicDemo();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        //
        BasicDemo t2 = new BasicDemo();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        //
        BasicDemo t3 = new BasicDemo();
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();

        System.out.println(t2.isAlive());
    }
}
