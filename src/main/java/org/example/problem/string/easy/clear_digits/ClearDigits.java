package org.example.problem.string.easy.clear_digits;

import org.example.CommonInterface;
import org.example.ObjectStore;
import org.example.problem.string.StringInterface;

import java.util.Objects;
import java.util.Scanner;

public class ClearDigits implements StringInterface, CommonInterface {

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please enter a string");

        String str = sc.nextLine();

        String str_1 = clearDigits(str);
        if (Objects.equals(str_1, "")) System.out.println("The string is empty");
        System.out.println(clearDigits(str));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private String clearDigits(String s){
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!stack.isEmpty()) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
