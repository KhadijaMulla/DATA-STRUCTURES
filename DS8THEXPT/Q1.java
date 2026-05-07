// Singly and Doubly Linked List

// SINGLY LINKED LIST
class SinglyNode {
    int data;
    SinglyNode next;

    SinglyNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    SinglyNode head;

    void insert(int data) {
        SinglyNode newNode = new SinglyNode(data);

        if (head == null) {
            head = newNode;
        } else {
            SinglyNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        SinglyNode temp = head;
        System.out.print("Singly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// DOUBLY LINKED LIST
class DoublyNode {
    int data;
    DoublyNode prev, next;

    DoublyNode(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    DoublyNode head;

    void insert(int data) {
        DoublyNode newNode = new DoublyNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void display() {
        DoublyNode temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Q1 {
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(10);
        sll.insert(20);
        sll.insert(30);
        sll.display();

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(100);
        dll.insert(200);
        dll.insert(300);
        dll.display();
    }
}