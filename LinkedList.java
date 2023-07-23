public class LinkedList {
    // Creating the single node with the help of Node class
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    

    // add first
    public void addFirst(int data){     // O(1) constant
        // Step 1 Create newNode
        Node newNode = new Node(data); 
        size++;
        // To check the linked list is empty or not
        if(head == null){ 
            head = tail = newNode;
            return;
        }
        // Step 2     newNode next = head
        newNode.next = head;   // linking

        // Step 3     head = newNode
        head = newNode;
    }



    // Add last
    public void addLast(int data){    // O(1)
        // Step 1 Create newNode
        Node newNode = new Node(data);
        size++;
        // To check the linked list is empty or not
        if(head == null){
            head = tail = newNode;
        }         
        // tail.next = newNode;
        tail.next = newNode;
        // tail = newNode
        tail = newNode;
    }



    // Add  middle
    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < index-1){
            temp = temp.next;
            i++;
        }
        // i = index-1  temp -> prev node
        newNode.next = temp.next;
        temp.next = newNode;
    }



    // print()
    public void print(){   // O(n)
        // if(head==null){
        //     System.out.println("LL is empty");
        //     return;
        // }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // removeFirst()
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty"); 
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // removeLast()
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
                 //  i<= size-1   (Prev node)
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }


    // Q  find a key in LL using iterative Search and return its index or position
    public int itrSearch(int key){      // O(n)
        Node temp = head;
        int i=0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Q  Reverse a linked List     O(n)
    public void reverseLL(){
        Node prev = null;    // head ki pehle wali node null hoti hai
        Node curr = tail = head;
        Node next = curr.next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find and remove the Nth node from the end      So that Nth node = sz - n + 1 from the starting of LL
    public static void deleteNthNodefromEnd(int n){
        int sz = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){       //condition for (Mera head node delete karna hai kya)
            head = head.next;
            return;
        }    

        // sz - n       =  Prev node
        int i = 1;
        Node prev = head;
        while(i < sz - n){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Q To check a LL is Palindrome or not

    // Fast and slow approach to find the midNode
    public Node findMid(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public boolean checkPalindrome(){
        if(head == null || head == head.next){
            return true;
        }
        // Step 1   Find the midNode
        Node midNode = findMid(head);

        // Step 2   Reverse 2nd half LL
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // Step 3   Check 1st half LL == 2nd Half LL
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();                     // null
        ll.addFirst(2);           
        ll.print();                     // 2->null
        ll.addFirst(1);
        ll.print();                     // 1->2->null
        ll.addLast(3); 
        ll.print();                     // 1->2->3->null
        ll.addLast(4);
        ll.print();                     // 1->2->3->4->null
        ll.add(2,9);
        ll.print();                     // 1->2->9->3->4->null
        System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();                     // 2->9->3->4->null

        // ll.removeLast();
        // ll.print();                     // 2->9->3->null
        // System.out.println(ll.size);    // 3

        // System.out.println("The key at index "+ll.itrSearch(3));
        // System.out.println("Key not present "+ll.itrSearch(50));

        ll.reverseLL();
        ll.print();

        // ll.deleteNthNodefromEnd(3);
        // ll.print();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.print();
        // System.out.println(ll.checkPalindrome());
    }
}
