package org.example.array.easy.two_sum;

import org.example.CommonInterface;
import org.example.array.ArrayInterface;
import org.example.ObjectStore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum implements ArrayInterface, CommonInterface {

    @Override
    public void solve() {
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please add space seperated list of numbers to be added to nums[]");

        String numString = sc.nextLine();
        int[] nums = getNums(numString);

        System.out.println("Please add target");
        int target = sc.nextInt();

        int[] targetArray = twoSum(nums, target);
        System.out.println(Arrays.toString(targetArray));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> storeDiff = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (storeDiff.containsKey(diff)) return new int[]{storeDiff.get(diff), i};
            storeDiff.put(nums[i], i);
        }
        return new int[2];
    }

}