import java.util.LinkedList;

public class LinkedListinJCF {
    public static void main(String[] args) {
        // Creation of the Linked List
        LinkedList <Integer>  ll = new LinkedList<>();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        System.out.println(ll);      // [30, 20, 10]

        ll.addLast(60);
        ll.addLast(50);
        System.out.println(ll);      // [30, 20, 10, 60, 50]

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);      // [20, 10, 60]
        
    }
}
