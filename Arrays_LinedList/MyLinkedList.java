package Arrays_LinedList;

// реализация односвязного списка
public class MyLinkedList<E> {
    Node<E> tail = null;
    Node<E> head = null;

    public void addBeforeHead(E data) {
        Node<E> newHead = new Node<>();
        newHead.data = data;
        newHead.next = head;
        if (head == null) {
            tail = newHead;
        }
        head = newHead;
    }

    public void addAfterTail(E data) {
        Node<E> newTail = new Node<>();
        newTail.data = data;
        if (head == null) {
            head = newTail;
        }
        if (tail == null) {
            tail = newTail;
        } else {
            tail.next = newTail;
            tail = newTail;
        }
    }

    public void printLinkedList() {
        Node<E> list = head;
        while (list!= null) {
            System.out.print(list.data + "->");
            list = list.next;
        }
        System.out.println();
    }

    public E getKFromTail(int k) {
        Node<E> list = head;
        Node<E> runner = null;
        int i = 0;
        while (list != null) {
            if (i < k) {
                i++;
            } else if (i == k) {
                i++;
                runner = head;
            } else {
                runner = runner.next;
            }
            list = list.next;
        }
        System.out.println("element num " + runner.data);
        return runner.data;
    }

    public Node<E> getLinkForDeleteElem(int k) throws Exception {
        Node<E> list = head;
        int i = 0;
        while (list != null) {
            if (i == k) {
                deleteNode(list);
                return list;
            }
            i++;
            list = list.next;
        }
        throw new Exception("not found such position");
    }

    public void deleteNode(Node<E> node) {
        while (node != null) {
            node = node.next;
        }
    }

    public Node getHead(){
        return head;
    }

    public class Node<E> {
        public Node<E> next;
        public E data;
        public Node() {
        }
    }

}