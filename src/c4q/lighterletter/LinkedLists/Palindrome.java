package c4q.lighterletter.LinkedLists;

/**
 *
 * Created by c4q-john on 3/23/16.
 *
 * This whole thing could be made neater.
 *
 */

public class Palindrome {

     linkNode head;


    public Palindrome(char item){
            head = new linkNode(item);
    }


    public void add(char item){

        if (head == null){
            head = new linkNode(item);
        }

        linkNode node = head;

        while(node.next != null){
            node = node.next;
        }
        node.next = new linkNode(item);
    }


    public  boolean isPalindrome() {

        if (head == null){
            return false;
        }

        linkNode node = head;
        StringBuilder sb = new StringBuilder();


        while (node.next != null) {
            sb.append(node.data);
            node = node.next;
        }

        sb.append(node.data);

        String word = sb.toString();
        String secondHalf = "";

        for (int i = word.length()-1; i > word.length()/2; i--) {
            secondHalf += word.charAt(i);
        }

        if(word.substring(0,word.length()/2).equals(secondHalf)){
            return true;

        }
        return false;
    }

}

class linkNode {
    char data;
    linkNode next;

    public linkNode(char letter) {
        data = letter;
    }
}
