package org.example.problem.array.easy.best_time_to_buy_and_sell_stock;

import java.util.Scanner;

import org.example.CommonInterface;
import org.example.ObjectStore;
import org.example.problem.array.ArrayInterface;

public class BestTimeToBuyAndSellStock implements ArrayInterface, CommonInterface{

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please add space seperated list of numbers");

        String numString = sc.nextLine();
        int[] nums = getNums(numString);

        System.out.println(bestTimeToBuyAndSellStock(nums));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private int bestTimeToBuyAndSellStock(int[] prices) {
        int p1 = 0;
        int p2 = 1;
        int maxDiff = 0;
        if(prices.length <= 1) return maxDiff;
        while(p2 < prices.length){
            if(prices[p2] < prices[p1]){
                p1 = p2;
            }
            else{
                int diff = prices[p2] - prices[p1];
                if(maxDiff < diff) maxDiff = diff;
            }
            p2++;
        }
        return maxDiff;
    }
}
