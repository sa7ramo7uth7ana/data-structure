/**
give an implementation of the size () method for the circularylinked list class
 assuming that we did not maintain size as instance variable.
 follow circularyLinkedList*/
public class Lab7Q2 {
    public class Node <E>{
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next){
            this.element=element;
            this.next=next;
        }

        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setElement(E element) {
            this.element = element;
        }




    }
}
