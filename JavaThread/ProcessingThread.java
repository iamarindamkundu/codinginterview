public class ProcessingThread implements Runnable{

    private int count;

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processingSomething(i);
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public void processingSomething(int i ) {
        try{
            Thread.sleep(i*1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}