class Node1 {
    int val;
    Node1 next;

    Node1(int val) {
        this.val = val;
        this.next = null;
    }
} // head means front

public class Queue1 {
    Node1 head;
    Node1 temp;

    void DeleteAtFirst() { // Dequeue
        if (head == null) {
            return;
        }
        head = head.next;
    }

    void InsertAtLast(int val) { // enqueue
        Node1 newnode1 = new Node1(val);
        if (head == null) {
            head = newnode1;
            return;
        }
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode1;
    }

    void Display() {
        Node1 temp1 = head;
        while (temp1 != null) {
            System.out.print(temp1.val + "  ");
            temp1 = temp1.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Queue operations ");
        Queue1 obj = new Queue1();
        obj.DeleteAtFirst();
        obj.InsertAtLast(20);
        obj.InsertAtLast(30);
        obj.InsertAtLast(30);
        obj.InsertAtLast(30);
        obj.InsertAtLast(30);
        obj.InsertAtLast(20);
        obj.InsertAtLast(30);
        obj.InsertAtLast(30);
        obj.InsertAtLast(30);
        obj.InsertAtLast(30);
        obj.Display();
        obj.DeleteAtFirst();
        obj.DeleteAtFirst();
        obj.Display();
        obj.InsertAtLast(30);
        obj.InsertAtLast(30);
        obj.Display();
    }
}
