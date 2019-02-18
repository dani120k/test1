package t;

import java.util.PriorityQueue;

public class StringQueue {
    private PriorityQueue<String> queue;

    public StringQueue(){
        queue = new PriorityQueue<>(1000, new StringComparator());
    }

    public synchronized void add(String str){
        queue.add(str);
    }

    public synchronized String get(){
        return queue.poll();
    }
}
