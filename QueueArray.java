public class QueueArray {
    private int [] arr;
    private int frontIndex;
    private int backIndex;
    private int numItems;
    

    public QueueArray(int size) {
        this.arr = new int[size];
        this.backIndex = -1;
        this.frontIndex = -1;
        this.numItems = 0;
        System.out.println("The Queue is successfully created wih size of: " + size + ".");
    }

    // isFull
    public boolean isFull(){
        if(backIndex == arr.length-1){
            return true;
        } else {
            return false;
        }
    }

    // isEmpty
    public boolean isEmpty(){
       return (numItems == 0);
    }

    // Enqueue 
    public void enQueue (int value){
        if (isFull()){
            System.out.println("The Queue is Full.");
        } else if (isEmpty()) {
            frontIndex = 0;
            backIndex++;
            numItems++;
            arr[backIndex] = value;
            System.out.println("Successfully inserted " + value + " in the queue.");
        } else {
            backIndex++;
            numItems++;
            arr[backIndex] = value;
            System.out.println("Successfully inserted " + value + " in the queue.");
        }
    }

    //  DeQueue 
    public int deQueue (){
        if (isEmpty()){
            System.out.println("The queue is empty.");
            return -1;
        } else {
            int result = arr[frontIndex];  // assign variable "result" to front element of array
            frontIndex++; // point to next element 
            if (frontIndex > backIndex){
                frontIndex = backIndex = -1; // reset indexes
            }
            numItems--;
            return result;
        }
    }

    // Peek
    public int peek(){
        if (!isEmpty()){
            return arr[frontIndex];
        } else {
            System.out.println("The Queue is empty.");
            return -1;
        }
    }

    // Delete
    public void deleteQueue(){
        arr = null;
        frontIndex = -1; 
        backIndex = -1; 
        numItems = 0;
        System.out.println("The queue is successfully deleted.");
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        String result = "Queue: [";
        for (int i = frontIndex; i <= backIndex; i++) {
            result += arr[i];
            if (i < backIndex) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}