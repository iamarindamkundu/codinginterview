public class ThreadSafety {
    public static void main(String[] args) throws InterruptedException{
        ProcessingThread pt = new ProcessingThread();

        Thread t1 = new Thread(pt);
        t1.start();
        Thread t2 = new Thread(pt);
        t2.start();

        // wait for thread to finish
        t1.join();
        t2.join();
        System.out.println("Processing count: " + pt.getCount());
    }
}