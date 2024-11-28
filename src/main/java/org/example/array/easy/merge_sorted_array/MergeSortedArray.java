package org.example.array.easy.merge_sorted_array;

import org.example.ArrayInterface;
import org.example.Execute;
import org.example.ObjectStore;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray implements ArrayInterface {

    @Override
    public void solve() {
        Scanner sc = new Scanner(System.in);

        initialMessage();

        System.out.println("Please add space seperated list of numbers to be added to nums1[]");
        String numString1 = sc.nextLine();
        int[] nums1 = getNums(numString1);

        System.out.println("Please add length of the nums1[]");
        String numsString1_length = sc.nextLine();
        int nums1_length = Integer.parseInt(numsString1_length);

        System.out.println("Please add space seperated list of numbers to be added to nums2[]");
        String numString2 = sc.nextLine();
        int[] nums2 = getNums(numString2);

        System.out.println("Please add length of the nums2[]");
        String numsString2_length = sc.nextLine();
        int nums2_length = Integer.parseInt(numsString2_length);

        int[] targetArray = merge(nums1, nums1_length, nums2, nums2_length);
        System.out.println(Arrays.toString(targetArray));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    public MergeSortedArray getObject() {
        return new MergeSortedArray();
    }

    private int[] merge(int[] nums1, int m, int[] nums2, int n){
        int[] arr = new int[m+n];

        int p1 = 0;
        int p2 = 0;
        int count = 0;
        while(p1 < m && p2 < n){
            if(nums1[p1] == nums2[p2]){
                arr[count] = nums1[p1];
                count++;
                arr[count] = nums2[p2];
                count++;
                p1++;
                p2++;
            }
            else if(nums1[p1] < nums2[p2]){
                arr[count] = nums1[p1];
                count++;
                p1++;
            }
            else if(nums1[p1] > nums2[p2]){
                arr[count] = nums2[p2];
                count++;
                p2++;
            }
        }

        if(p1 != m){
            while(p1 < m){
                arr[count] = nums1[p1];
                count++;
                p1++;
            }
        }
        else if(p2 != n){
            while(p2 < n){
                arr[count] = nums2[p2];
                count++;
                p2++;
            }
        }

        if (m + n >= 0) System.arraycopy(arr, 0, nums1, 0, m + n);

        return arr;
    }
}
