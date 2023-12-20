package iterable.linkedlist;

import java.util.Iterator;

public class ListIterator<Integer> implements Iterator<Integer> {
    LinkedList list;
    Node curr;
    ListIterator(LinkedList list){
        this.list=list;
        this.curr=list.head;
    }
    @Override
    public boolean hasNext() {
        return curr!=null;
    }

    @Override
    public Integer next() {
        Integer temp= (Integer) curr.val;
        curr=curr.next;
        return temp;
    }
}
