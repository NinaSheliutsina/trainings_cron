package Arrays_LinedList;
/**
 * Даны два числа, представленных однонаправленными связными списками.
 * Каждый узел списка содержит цифру. Цифры в списках сохранены в обратном
 * порядке. Напишите функцию, выполняющую сложение двух таких чисел и
 * возвращающую результат в виде такого же связного списка.
 * input: {7 -> 1 -> 6}, {5 -> 9 -> 7 -> 9} т. е. 617 + 9795
 * output: {2 -> 1 -> 4 -> 0 -> 1} т.е. 10412
 */
public class Task3 {
    public static void main(String [] args){
        MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
        list1.addAfterTail(1);
        list1.addAfterTail(2);
        list1.addAfterTail(3);

        MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();
        list2.addAfterTail(4);
        list2.addAfterTail(5);
        list2.addAfterTail(6);
        list2.printLinkedList();


    }
}
