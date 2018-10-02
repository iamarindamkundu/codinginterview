public class Worker implements Runnable {
    PrintThreadName ptn;
    public Worker() {
        ptn = new PrintThreadName();
    }

    @Override
    public void run() {
        ptn.setName(Thread.currentThread().getName());
        try{
        Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        ptn.printName();
    }
}