package iterable.linkedlist;

import java.util.Iterator;


public class LinkedList<Integer> implements Iterable<Integer>{
    Node head;
    public LinkedList(Node head){
        this.head=head;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator<Integer>(this);
    }
}
