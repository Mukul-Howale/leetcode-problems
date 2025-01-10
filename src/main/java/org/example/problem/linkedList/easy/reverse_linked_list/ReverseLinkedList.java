package org.example.problem.linkedList.easy.reverse_linked_list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.example.CommonInterface;
import org.example.ObjectStore;
import org.example.problem.linkedList.LinkedListIInterface;

public class ReverseLinkedList implements CommonInterface, LinkedListIInterface{

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please add space seperated list of numbers");

        String numString = sc.nextLine();
        ListNode list = getLinkedList(numString);

        ListNode reversedList = reverseList(list);

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            if(curr.getNext() == null){
                curr.setNext(prev);
                break;
            }
            ListNode next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
