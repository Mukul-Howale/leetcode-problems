package org.example.problem.linkedList.easy.reverse_linked_list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.example.CommonInterface;
import org.example.ObjectStore;
import org.example.problem.linkedList.LinkedListInterface;

public class ReverseLinkedList implements CommonInterface, LinkedListInterface{

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please add space seperated list of numbers");

        String numString = sc.nextLine();
        ListNode list = getLinkedList(numString);

        ListNode reversedList = reverseList(list);

        printLinkedList(reversedList);
        System.out.println();

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private ListNode reverseList(ListNode head) {
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
