import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Service {
    public static void main(String[] args) {
        // Create BlockingQueue of size 10
        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        // Starting producer to produce messages in queue
        new Thread(producer).start();
        // Starting consumer to consume messages in queue
        new Thread(consumer).start();
        System.out.println("Producer and consumer has been started");
    }
}