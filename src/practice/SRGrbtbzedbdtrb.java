package practice;

import java.util.Stack;

public class SRGrbtbzedbdtrb<T> {
    private Stack<T> stackEnqueue; // Stack for enqueue operation
    private Stack<T> stackDequeue; // Stack for dequeue operation

    public SRGrbtbzedbdtrb() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    public void enqueue(T item) { 
        while (!stackDequeue.isEmpty()) {
            stackEnqueue.push(stackDequeue.pop());
        }

        // Push the new item onto stackEnqueue
        stackEnqueue.push(item);

        // Move all elements back to stackDequeue
        while (!stackEnqueue.isEmpty()) {
            stackDequeue.push(stackEnqueue.pop());
        }
    }

    public T dequeue() {
        // Pop and return the front element from stackDequeue
        if (!stackDequeue.isEmpty()) {
            return stackDequeue.pop();
        } else {
            throw new IllegalStateException("Queue is empty");
        }
    }

    public boolean isEmpty() {
        return stackDequeue.isEmpty();
    }

    public int size() {
        return stackDequeue.size();
    }
    

    public static void main(String[] args) {
        SRGrbtbzedbdtrb<Integer> queue = new SRGrbtbzedbdtrb<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue: " + queue.dequeue()); // Dequeue: 1
        System.out.println("Dequeue: " + queue.dequeue()); // Dequeue: 2
        System.out.println("Is Empty? " + queue.isEmpty()); // Is Empty? false
        System.out.println("Size: " + queue.size());       // Size: 1
    }
}