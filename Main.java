public class Main {
    
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(5);
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        queueArray.enQueue(4);

        System.out.println(queueArray.toString());

        queueArray.deQueue();
        queueArray.deQueue();

        System.out.println(queueArray.toString());

        System.out.println("The integer at the front of the queue is " + queueArray.peek() + ".");

        queueArray.deleteQueue();
        System.out.println("The queue is empty: " + queueArray.isEmpty());

        System.out.println(queueArray.toString());

        System.out.println();
    }
}
