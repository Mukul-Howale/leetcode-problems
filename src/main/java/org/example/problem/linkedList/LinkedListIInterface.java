package org.example.problem.linkedList;

public interface LinkedListIInterface {

    class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public ListNode getNext(){
            return next;
        }

        public void setNext(ListNode prev){
            next = prev;
        }
    }

    default ListNode getLinkedList(String numString){
        // String[] stringNums = numString.split(" ");
        // ListNode head = new ListNode();
        // ListNode 
        // int indx = stringNums.length-1;
        // while(indx >= 0){
            
        // }
        return new ListNode();
    }
}
