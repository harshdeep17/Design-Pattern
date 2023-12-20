package iterable;

import iterable.linkedlist.*;

public class Main {
    public static void main(String[] args) {
//        CakeList<String> cakes=new CakeList<>();
//        cakes.addCake("Chocolate");
//        cakes.addCake("Butterscotch");
//        for(String cake:cakes){
//            System.out.println(cake);
//        }
        Node head=new Node(0);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        LinkedList<Integer> list=new LinkedList(head);
        for(int val:list){
            System.out.println(val);
        }
    }
}
