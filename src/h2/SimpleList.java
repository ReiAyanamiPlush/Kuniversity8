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
        myList.insertAfter(45,4);
        myList.delete(45);


        myList.print();

        System.out.println("AAAAAAAAAAH");

    }

    private Node getFirst() {
        head = headBackup;
        if (head.next != null) {
            return head.next;
        } else {
            return null;
        }
    }

    private Node getLast() {
        head = headBackup;
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
        head = headBackup;
        if (head.next != null) {
            head = getLast();
            head.next = new Node(newValue);
        } else {
            head.next = new Node(newValue);
        }
    }

    private Node findFirst(int value) {
        head = headBackup;
        while (head.next != null) {
            if (head.next.value != value) {
                head = head.next;
            } else {
                return head.next;
            }
        }
        return null;
    }

//    private boolean insertAfter(int preValue, int newValue) {
//        head = findFirst(preValue);
//        if (head != null) {
//            head.next = new Node(newValue);
//            return true;
//        } else {
//            return false;
//        }
//    }

    public boolean insertAfter(int preValue, int newValue) {
        head = headBackup;
        Node current = head;


        while (current != null) {
            if (current.value == preValue) {

                Node newNode = new Node(newValue);
                newNode.next = current.next;
                current.next = newNode;
                return true;
            }
            current = current.next;
        }


        return false;
    }


//    private boolean delete(int value) {
//        head = headBackup;
//        head = findFirst(value);
//        if (head != null) {
//            head.next = head.next.next;
//            return true;
//        } else {
//            return false;
//        }
//    }

    public boolean delete(int value) {
        if (head != null && head.value == value) {
            head = head.next;
            return true;
        }


        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.value == value) {

                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }


        return false;
    }


    public void print() {
        head = headBackup;
        head = head.next;
        do {
            System.out.println(head.value);
            head = head.next;
        }
        while (head != null);
    }

}
