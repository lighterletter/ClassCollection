package c4q.lighterletter.LinkedLists;

/**
 * Created by c4q-john on 11/26/15.
 *
 *This is one way to represent a linked list using standard code.
 *
 */
public class Node {
    private Node next;
    private static Object data;

    public Node(Node next) {
        this.next = next;
    }
    public Node(Object Nodedata, Node node){
        next = node;

    }

    public Node getNext(){
        return next;
    }

    public Object getData(){
        return data;
    }
}
