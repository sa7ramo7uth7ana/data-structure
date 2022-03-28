package Lab6Q1;

import java.util.Queue;
import Lab6Q1.SinglyLinkedList;
/**
 Test the linked stack and the linked queue data structures and confirm if they apply the
 principals of stack and queue
 */
public class Lab6Q1  <E> implements Queue<E>{
    SingleyLinkedList<E> queue=new SingleyLinkedList<E>();
    public Lab6Q1(){
    }
    public boolean isEmpty(){
        return this.queue.isEmpty(){
        }
    }
    public int size(){
        return this.queue.size();
    }
    public E frist(){
        return this.queue.first();
    }

    public void enqueue (E element){
        this.queue.addlast(element);
    }
    public  E dequeue(){
        return this.queue.removefirst();
    }
}

