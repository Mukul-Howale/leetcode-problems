package org.example.problem.array.easy.contains_duplicate;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.example.CommonInterface;
import org.example.ObjectStore;
import org.example.problem.array.ArrayInterface;

public class ContainsDuplicate implements ArrayInterface, CommonInterface{

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please add space seperated list of numbers");

        String numString = sc.nextLine();
        int[] nums = getNums(numString);

        System.out.println(containsDuplicate(nums));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> twiceNum = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            if(twiceNum.contains(nums[i]))
                return true;
            twiceNum.add(nums[i]);
        }
        
        return false;
    }
}
