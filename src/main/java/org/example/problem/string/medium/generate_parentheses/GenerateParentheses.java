package org.example.problem.string.medium.generate_parentheses;

import org.example.CommonInterface;
import org.example.problem.string.StringInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParentheses implements StringInterface, CommonInterface {

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please enter number of parentheses to generate");

        int num = sc.nextInt();

        System.out.println(generateParentheses(num).toString());
    }

    private List<String> generateParentheses(int num){
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, num);
        return result;
    }

    private void backtrack(List<String> result, String current, int openCount, int closeCount, int num){
        if (openCount == num && closeCount == num) {
            result.add(current);
            return;
        }
        if (openCount < num) backtrack(result, current + "(", openCount + 1, closeCount, num);
        if (closeCount < openCount) backtrack(result, current + ")", openCount, closeCount + 1, num);
    }
}
