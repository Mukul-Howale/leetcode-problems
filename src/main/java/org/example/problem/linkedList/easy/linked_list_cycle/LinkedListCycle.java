package org.example.problem.linkedList.easy.linked_list_cycle;

import java.util.Scanner;

import org.example.CommonInterface;
import org.example.ObjectStore;
import org.example.problem.linkedList.LinkedListInterface;

/**
 * TODO :-
 * Taking position as input from user for creating cycle in linked list
 * Creating cycle in linked list using position
 * 
 */

public class LinkedListCycle implements CommonInterface, LinkedListInterface{

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);

        System.out.println("Please add space seperated list of numbers");
        String numString = sc.nextLine();

        System.out.println("Please enter position to create cycle in linked list");
        int position = sc.nextInt();

        ListNode list = getLinkedList(numString);
        ListNode cycleLinkedList = createCycle(list, position);

        System.out.println(hasCycle(cycleLinkedList));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private boolean hasCycle(ListNode head) {
        while(head != null){
            if(head.getVal() == 10001) return true;
            head.setVal(10001);
            head = head.getNext();
        }
        return false;
    }
}
