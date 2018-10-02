import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    } 

    @Override
    public void run() {
        try{
            Message msg;
            // consuming messages until exit message is reached
            while((msg = queue.take()).getMsg() != "exit") {
                Thread.sleep(10);
                System.out.println("Consumed " + msg.getMsg());
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}