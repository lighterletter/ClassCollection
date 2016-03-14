package c4q.lighterletter.LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by c4q-john on 3/14/16.
 */
public class RegularLinkedList {

    public static void main(String[] args) {
        // write your code here
        List<Integer> arrayList = new ArrayList<>();

        int counter = 15;

        while( counter > 1 ){
            counter--;
            arrayList.add(counter);

        }
        System.out.println("A list of integers in the array list");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);

        linkedList.add(1,"red");

        System.out.println("Display the linked list forward");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next() + " " );
        }

        System.out.println();

        System.out.println("Display the linked list backwards:");
        listIterator = linkedList.listIterator(linkedList.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous() + " ");
        }

    }
}
