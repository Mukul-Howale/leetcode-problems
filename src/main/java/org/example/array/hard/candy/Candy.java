package org.example.array.hard.candy;

import org.example.CommonInterface;
import org.example.array.ArrayInterface;
import org.example.ObjectStore;

import java.util.Scanner;

public class Candy implements ArrayInterface, CommonInterface {

    public void solve(){
        Scanner sc = new Scanner(System.in);
        initialMessage();
        System.out.println("Please add space seperated list of numbers");

        String numString = sc.nextLine();
        int[] nums = getNums(numString);

        System.out.println(candy(nums));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    public Candy getObject(){
        return new Candy();
    }

    private int candy(int[] ratings) {
        int n = ratings.length;
        int totalCandies = n;
        int i = 1;
        while (i < n) {
            if (ratings[i] == ratings[i - 1]) {
                i++;
                continue;
            }
            int currentPeak = 0;
            while (i < n && ratings[i] > ratings[i - 1]) {
                currentPeak++;
                totalCandies += currentPeak;
                i++;
            }
            if (i == n) {
                return totalCandies;
            }
            int currentValley = 0;
            while (i < n && ratings[i] < ratings[i - 1]) {
                currentValley++;
                totalCandies += currentValley;
                i++;
            }
            totalCandies -= Math.min(currentPeak, currentValley);
        }
        return totalCandies;
    }
}
