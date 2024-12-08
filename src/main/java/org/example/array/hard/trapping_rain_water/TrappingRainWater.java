package org.example.array.hard.trapping_rain_water;

import org.example.CommonInterface;
import org.example.array.ArrayInterface;
import org.example.ObjectStore;

import java.util.Scanner;

public class TrappingRainWater implements ArrayInterface, CommonInterface {

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please add space seperated list of numbers");

        String numString = sc.nextLine();
        int[] nums = getNums(numString);

        System.out.println(trappingRainWater(nums));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private int trappingRainWater(int[] nums){
        int left = 0, right = nums.length-1;
        int leftMax = nums[left], rightMax = nums[right];
        int waterCount = 0;
        while(left < right){
            if(leftMax <= rightMax){
                left++;
                if(leftMax < nums[left]) leftMax = nums[left];
                waterCount = waterCount + (leftMax - nums[left]);
            }
            else{
                right--;
                if(rightMax < nums[right]) rightMax = nums[right];
                waterCount = waterCount + (rightMax - nums[right]);
            }
        }
        return waterCount;
    }

}
