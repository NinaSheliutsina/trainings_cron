package Arrays_LinedList;

public class Task1 {
    /**Задача:
    *Напишите функцию поиска К'го с конца узла в однонаправленном связном списке.
    *Отсчет с конца производится с нуля.
    *Пример
    *input: {1 -> 2 -> 3 -> 4 -> 5 -> 6}, k = 2
    *output: 4
     **/

    public static void main(String [] args){
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();


        list.addAfterTail(1);
        list.addAfterTail(2);
        list.addAfterTail(3);
        list.addAfterTail(4);
        list.addAfterTail(5);
        list.addAfterTail(6);
        list.printLinkedList();

        int k =2;
        list.getKFromTail(k);

    }


}
