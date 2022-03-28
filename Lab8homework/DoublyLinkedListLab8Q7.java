/**
 Implement the clone()method for the Doubly Linked List Class.
 */
public class DoublyLinkedListLab8Q7<E> {
    implements Cloneable{
        private   static class Node<E> {
            private E element;
        }
        }

        private Node<E> prev;

        private  Node<E> next;


 public Node(E e, Node<E> p,
                Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }
        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

private Node<E> header;
        private Node<E> trailer;
        private int size = 0;
public DoublyLinkedList() {
            header = new Node<E>(null, null,
                    null);
            trailer = new Node<E>(null, header, null);
            trailer

                    header.setNext(trailer);
        }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        } else {
            return
                    header.getNext().getElement();

        }
    }

    public E last() {
        if (isEmpty()) {
            return null;
        } else {
            return
                    trailer.getPrev().getElement();
        }
    }
    public void ddFirst(E e) {
        addBetween(e, header,
                header.getNext());
    }

    public void (ddLast(E e) {
        addBetween(e, trailer.getPrev(),
                trailer);
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return
                    remove header.getNext());
        }
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            return
                    remove trailer.getPrev());
        }
    }
    private void addBetween(E e,
         Node<E> predecessor, Node<E>
                 successor) {

        Node<E> newest = new
                Node<>(e, predecessor,
                successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    private E remove(Node<E> node) {
        Node<E> predecessor =
                node.getPrev();
        Node<E> successor =
                node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    @SuppressWarnings({ "rawtypes" }
    )
            public boolean equals(Object o) {
            if (o == null) {
            return false;
            }

            if (getClass() != o.getClass()) {
            return false;
            }
            DoublyLinkedList other =
            (DoublyLinkedList) o;
            if (size != other.size) {
            return false;
            }
            Node walkA =
                    header;

            Node walkB =
                    other.header;
            for(int i = 0; i < size; i++) {
        if (!
                walkA.getElement().equals(walkB.getElement())) {
            return false;
        }
        walkA = walkA.getNext();
        walkB = walkB.getNext();
    }
 return true;
            }


            @SuppressWarnings("unchecked")
    public DoublyLinkedList<E>
    clone() throws
            CloneNotSupportedException {
        Object.clone() to create initial copy
                DoublyLinkedList<E> other =
                        (DoublyLinkedList<E>)
                                super.clone();
        if (size > 0) {
            other.header = new
                    Node<>(null, null, null);
            other.trailer = new
                    Node<>(null, other.header, null);

            other.header.setNext(other.trailer);
            Node<E> walk =
                    header.getNext();
                    Node<E> otherWalk =
                            other.header;
            for(int i = 0; i < size; i++)
            {

                        Node<E> newest = new
                                Node<>(walk.getElement(), null,
                                null);

                otherWalk.setNext(newest);
                otherWalk = newest;

                otherWalk.setPrev(newest);
                walk = walk.getNext();
            }
        }
        return other;
    }


    @SuppressW(rnings({ "rawtypes",
            "unchecked" })
            public static void main(String
            args[]) {
        DoublyLinkedList theList =
                new DoublyLinkedList();
        DoublyLinkedList clonedList;
        theList.addFirst(1);
        theList.addFirst(2);
        theList.addL(st(3);
        try {
            clonedList = theList.clone();
            System.out.println("Original List values");
            while(theList.first() != null) {

                System.out.println(theList.removeFirst());
            }
            System.out.println("ClonedList values");
            while(clonedList.first() !=
                    null) {

                System.out.println(clonedList.removeFirst());
            }

            System.out.println(theList.equals(clonedList));
        } catch
                (CloneNotSupportedException e) {
            System.err.println("I AM ERROR: List didn't clone.");
            e.printStackTrace();
        }
}
