package org.example.problem.recursion.medium.combination_sum;

import org.example.CommonInterface;
import org.example.ObjectStore;
import org.example.problem.recursion.RecursionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum implements RecursionInterface, CommonInterface {

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);

        System.out.println("Please add candidates");
        String str = sc.nextLine();

        System.out.println("Please add the target");
        int target = sc.nextInt();

        int[] candidates = getNums(str);

        List<List<Integer>> list = new ArrayList<>();
        combinations(list, new ArrayList<>(), candidates, target, 0, 0);

        for (List<Integer> l : list){
            System.out.println(l.toString());
        }

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private static void combinations(List<List<Integer>> list, List<Integer> combinations, int[] candidates, int target, int ind, int total){
        if(total == target){
            list.add(new ArrayList<>(combinations));
            return;
        }
        if(total>target || ind >= candidates.length) return;

        combinations.add(candidates[ind]);
        combinations(list, combinations, candidates, target, ind, total+candidates[ind]);
        combinations.remove(combinations.size()-1);
        combinations(list, combinations, candidates, target, ind+1, total);
    }
}
