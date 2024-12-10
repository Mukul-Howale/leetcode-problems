package org.example.problem.array.medium.search_in_rotated_sorted_array;

import org.example.CommonInterface;
import org.example.problem.array.ArrayInterface;
import org.example.ObjectStore;

import java.util.Scanner;

public class SearchInRotatedSortedArray implements ArrayInterface, CommonInterface {

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please add space seperated list of numbers");

        String numString = sc.nextLine();
        int[] nums = getNums(numString);

        System.out.println("Please enter the target");
        int target = sc.nextInt();

        System.out.println(searchInRotatedSortedArray(nums,target));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private int searchInRotatedSortedArray(int[] nums, int target){
        int p1 = 0, p2 = nums.length-1, index = -1;

        while(p1 <= p2){
            if(nums[p1] == target){
                index = p1;
                break;
            }
            else if(nums[p2] == target){
                index = p2;
                break;
            }
            else if(target < nums[p1] && target > nums[p1]){
                break;
            }
            p1++;
            p2--;
        }
        return index;
    }
}
