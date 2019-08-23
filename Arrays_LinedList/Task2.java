package Arrays_LinedList;

/**
 * Напишите функцию удаления заданного внутреннего элемента (не крайнего) в
 * связном однонаправленном списке, если дан указатель только на этот удаляемый
 * элемент.
 */
public class Task2 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        list.addAfterTail(1);
        list.addAfterTail(2);
        list.addAfterTail(3);
        list.addAfterTail(4);
        list.addAfterTail(5);
        list.addAfterTail(6);
        list.addAfterTail(7);
        list.addAfterTail(8);

        list.printLinkedList();
        int k = 2;
        try {
            MyLinkedList<Integer>.Node<Integer> delete = list.getLinkForDeleteElem(k);
            System.out.println("node value " + delete.data);
            list.deleteNode(delete);
        } catch (Exception e) {
        }

        list.printLinkedList();


    }
}
