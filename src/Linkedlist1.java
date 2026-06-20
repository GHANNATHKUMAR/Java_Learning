class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class Linkedlist1 {
    Node head;
    int size = 0;
    void insertAtfirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    void printNode() {
        Node temp = head;
        if (temp == null) {
            System.out.println("no node has been created ");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("current size is " + size);
    }

    void deleteAtfirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    void deleteAtLast() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    void insertAtLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    void insertAtIndex(int val, int index) {
        if (index < 0 && index > size + 1) {
            System.out.println("not possible to insert your given condition");
            return;
        } else if (index == 0) {
            insertAtfirst(val);
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < index) {
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    void DeleteAtIndex(int index) {
        if (index < 0 && index >= size) {
            System.out.println("not possible to delete  your given condition");
            return;
        } else if (index == 0) {
            deleteAtfirst();
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < index) {
            temp = temp.next;

            i++;
        }
        temp.next = temp.next.next;
        size--;

    }

    public static void main(String[] args) {
        Linkedlist1 obj1 = new Linkedlist1();
        obj1.printNode();
        System.out.println("now we will be created and we are printing our node ");
        obj1.insertAtfirst(10);
        obj1.insertAtfirst(20);
        obj1.insertAtfirst(30);
        obj1.insertAtfirst(40);
        obj1.insertAtfirst(50);
        obj1.insertAtfirst(60);
        System.out.println("we will be inserted node at  first ");
        obj1.printNode();
        System.out.println("we will be inserted node at  Last ");
        obj1.insertAtLast(70);
        obj1.printNode();
        System.out.println("we will be deleted at first");
        obj1.deleteAtfirst();
        obj1.printNode();
        System.out.println("we will be  deleted at last  ");
        obj1.deleteAtLast();
        obj1.printNode();
        System.out.println("we will be inserted at an index  ");
        obj1.insertAtIndex(56, 3);
        obj1.printNode();
        System.out.println("we will delet at an index  ");
        obj1.DeleteAtIndex(3);
        obj1.printNode();
    }
}
