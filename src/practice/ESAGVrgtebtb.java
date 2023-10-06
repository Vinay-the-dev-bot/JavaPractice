package practice;

import java.util.LinkedList;
import java.util.Queue;

public class ESAGVrgtebtb<T> {
    private Queue<T> primaryQueue;
    private Queue<T> secondaryQueue;

    public ESAGVrgtebtb() {
        primaryQueue = new LinkedList<>();
        secondaryQueue = new LinkedList<>();
    }

    public void push(T item) {
        primaryQueue.offer(item);
    }

    public T pop() {
        if (primaryQueue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements from primaryQueue to secondaryQueue except the last one
        while (primaryQueue.size() > 1) {
            secondaryQueue.offer(primaryQueue.poll());
        }

        // Get and return the last element from primaryQueue
        T poppedItem = primaryQueue.poll();

        // Swap the names of the queues to make the secondaryQueue the new primaryQueue
        Queue<T> temp = primaryQueue;
        primaryQueue = secondaryQueue;
        secondaryQueue = temp;

        return poppedItem;
    }

    public boolean isEmpty() {
        return primaryQueue.isEmpty();
    }

    public int size() {
        return primaryQueue.size();
    }

    public static void main(String[] args) {
        ESAGVrgtebtb<Integer> stack = new ESAGVrgtebtb<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop()); // Pop: 3
        System.out.println("Pop: " + stack.pop()); // Pop: 2
        System.out.println("Is Empty? " + stack.isEmpty()); // Is Empty? false
        System.out.println("Size: " + stack.size()); // Size: 1
    }
}
