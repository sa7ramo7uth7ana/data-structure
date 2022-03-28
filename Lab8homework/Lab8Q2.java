/**
 given an implementation of the size () method for the DoublyLinkedList class ,
 assuming that we did not maintain size as instance variable.
 */
public class Lab8Q2 {
    static class  Node{
        char data;
        Node prev;
        Node next;
    }
    static Node head=null;
    static void Rotate(int S)
    {
       if (S==0)
           return;
        Node current=head;
        int count=1;
        while (count<S&&current!=null){
            current=current.next;
            count++;
        }
        if (current==null)
            return;
        Node theNode=current;
        while (current.next!=null)
            current=current.next;
        current.next=head;
        (head).prev=current;
        head=theNode.next;
        (head).prev=null;
        theNode.next=null;
    }
    static void push(char new_data){
        Node new_node=new Node();
        new_node.data=new_data;
        new_node.prev=null;
        new_node.next=(head);
        if ((head)!=null)
            (head).prev=new_node;
        head=new_node;
    }
    static void printList(Node node){
        while (node!=null&&node.next!=null){
            System.out.println(node.data+" ");
        node=node.next;}
        if (node!=null)
            System.out.println(node.data);
    }

    public static void main(String[] args) {
        push('a');
        push('d');
        push('c');
        push('b');
        push('f');
        int S=2;
        System.out.println("given the linked list");
        printList(head);
        Rotate(S);
        System.out.println();
        System.out.println("Rotate Linked List");
        printList(head);



    }
}
