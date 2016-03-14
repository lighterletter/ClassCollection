package c4q.lighterletter.LinkedLists;

/**
 * Created by c4q-john on 11/27/15.
 *
 * Another ay to implement a node, in this case, using generics.
 */
public class NodeGen<E> {
    NodeGen<E> next;
    E data;
}

class singlyList{
    NodeGen head;
    int data;

    public singlyList(NodeGen head) {
        this.head = head;
    }

    public void addToHead(String data) {
        NodeGen newNode = new NodeGen();
    }
}
