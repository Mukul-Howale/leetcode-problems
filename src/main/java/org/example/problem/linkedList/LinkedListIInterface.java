package org.example.problem.linkedList;

import java.util.Arrays;

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
        int[] nums = Arrays.stream(numString.split(" ")).mapToInt(Integer::parseInt).toArray();
        ListNode head = new ListNode(nums[0]);
        ListNode curr = head;
        int index = 1;
        while(index < nums.length){
            curr.setNext(new ListNode(nums[index]));
            curr = curr.getNext();
            index++;
        }
        return head;
    }

    default void printLinkedList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.getNext();
        }
    }
}
