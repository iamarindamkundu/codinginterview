public class Master {
    public static void main(String[] args) throws InterruptedException{
        Worker worker = new Worker();

        Thread t1 = new Thread(worker, "t1");
        Thread t2 = new Thread(worker, "t2");
        Thread t3 = new Thread(worker, "t3");
        Thread t4 = new Thread(worker, "t4");
        Thread t5 = new Thread(worker, "t5");
        t1.start();
        System.out.println("Main is waiting for t1 to finish");
        t1.join();
        
        t2.start();
        System.out.println("Main is waiting for t2 to finish");
        t2.join();
        
        t3.start();
        System.out.println("Main is waiting for t3 to finish");
        t3.join();
        
        t4.start();
        System.out.println("Main is waiting for t4 to finish");
        t4.join();
        
        t5.start();
        System.out.println("Main is waiting for t5 to finish");
        t5.join();
        
        System.out.println("DONE");
    }
}