package com.company;
public class SingleLinkedList <E> {
 private    Node<E> head= null;
 private    Node<E> tail= null;
 private    int  size =0;

    public SingleLinkedList(){

    }

    public boolean isEmpty(){

        return size==0;
    }
    public  int size(){
        return size;
    }
public E frist()
{
        if (isEmpty()) return null;
        return head.getElement();
}
    public E  last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }
    public void addFrist( E element){

        head= new Node<E>(element,head);
        if ( size==0)
            tail=head;
        size++;
    }
    public void addLast( E element){
          Node<E> x = new Node<E>(element,null);
        if ( size==0)
            head=x;
        else
            tail.setNext(x);
        tail=x;
        size++;
    }
    public E removeFirst(){
        if ( isEmpty())return null;
        E del =head.getElement();
        head = head.getNext();
        size--;
        if ( size==0)
            tail=null;
        return del;
    }




private static class Node<E>{
    E element;
    Node<E> next;

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
}
