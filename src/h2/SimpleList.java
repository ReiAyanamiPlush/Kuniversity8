package h2;

public class SimpleList {

    Node head;
    Node headBackup;

    SimpleList() {
        head = new Node(0);
        headBackup = head;
    }

    public void knorb2(){

        SimpleList myList = new SimpleList();
        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);
        myList.print();

        myList.insertAfter(45,4);
        System.out.println("AAAAAAAAAAH");

    }

    private Node getFirst() {
        if (head.next != null) {
            return head.next;
        } else {
            return null;
        }
    }

    private Node getLast() {
        if (head.next != null) {
            while (head.next != null) {
                head = head.next;
            }
            return head;
        } else {
            return null;
        }
    }

    private void append(int newValue) {
        if (head.next != null) {
            head = getLast();
            head.next = new Node(newValue);
        } else {
            head.next = new Node(newValue);
        }
    }

    private Node findFirst(int value) {
        while (head.next != null) {
            if (head.next.value != value) {
                head = head.next;
            } else {
                return head.next;
            }
        }
        return null;
    }

    private boolean insertAfter(int preValue, int newValue) {
        head = findFirst(preValue);
        if (head != null) {
            head.next = new Node(newValue);
            return true;
        } else {
            return false;
        }
    }

    private boolean delete(int value) {
        head = findFirst(value);
        if (head != null) {
            head.next = head.next.next;
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        do {
            System.out.println(head.value);
            head = head.next;
        }
        while (head != null);
    }

}
