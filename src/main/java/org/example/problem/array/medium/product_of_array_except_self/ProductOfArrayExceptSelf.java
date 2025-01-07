package org.example.problem.array.medium.product_of_array_except_self;

import java.util.Scanner;

import org.example.CommonInterface;
import org.example.ObjectStore;
import org.example.problem.array.ArrayInterface;

public class ProductOfArrayExceptSelf implements ArrayInterface, CommonInterface{

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please add space seperated list of numbers");

        String numString = sc.nextLine();
        int[] nums = getNums(numString);

        System.out.println(productOfArrayExceptSelf(nums).toString());

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private int[] productOfArrayExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        int[] product = new int[len];
        prefix[0] = nums[0];
        for(int i=1; i<len; i++){
            prefix[i] = nums[i] * prefix[i-1];
        }
        suffix[len-1] = nums[len-1];
        for(int i=len-2; i>=0; i--){
            suffix[i] = nums[i] * suffix[i+1];
        }
        product[0] = suffix[1];
        product[len-1] = prefix[len-2];
        for(int i=1; i<len-1; i++){
            product[i] = prefix[i-1] * suffix[i+1];
        }
        return product;
    }
}
