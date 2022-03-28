/**
 impelement the equals () method for the circularly linked list class assuming that two lists are equal
 if they have same eqquence of elements,with correspond-ing element currently at the front of the size

public class Lab7Q3 {
    public class CircularLinkedList <E>{
        private Node<E> header;
        private Node<E> trailer;
        public boolean isEmpty(){
            return header

 private Node<E> tail=null;
        private  int size=0;
        public CircularLinkedList(){}

            size==0;
        }
        public  int size (){
            return size;
        }
        public E first(){
            return tail.getNext().getElement();
        }
        public E last(){
            if (isEmpty())
                return null;
            return tail.getElement();
        }
            public void addFirst(E element){
                if (size()==0)
                    tail=new Node <E>(element,null);
                tail.setNext(tail);
            }
            else{
            Node<E> n=new Node<E >(element,tail.getNext());
            tail.setNext(n);
            size++;
        }
        public void addLast(E element){
            addFirst(E element);
           tail=tail.getNext();
        }
        public E removeFirst(){
            if (isEmpty())return null;
            Node<E> x=tail.getNext();
            if (x==tail)
                tail.setNext(x.getNext());
            size--;
            return x.getElement();
        }
          public void rotate(){
              if (tail!=null)
                  tail=tail.getNext();
          }
          public boolean equals (object o){
              if (o==null) return false;
              if (getClass()!=o.getClass())
                  return false;
              CircularLinkedList other=(CircularLinkedList)o;
              if (size!=other.size)
                  return false;
              CircularLinkedList.Node walkA =tail;
              CircularLinkedList.Node walkB=other.tail;
              while (walkA.getElement().equals(walkB.getElement()))
                  return false;
              walkA=walkA.getNext();
              walkB=walkB.getNext();
              return true;
          }
          private static class Node<E>{
              E element;
              Node<E> next;
          }
          public Node(E element, Node<E>next){
              this.element=element;
              this.next=next;
          }
          public E getElement(){
              return element;
          }
          public void setElement(E element){
              this.element=element;}
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E>next){
            this.next=next;
        }
    }

}
 */