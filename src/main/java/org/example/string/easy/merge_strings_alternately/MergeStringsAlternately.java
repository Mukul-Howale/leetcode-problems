package org.example.string.easy.merge_strings_alternately;

import org.example.CommonInterface;
import org.example.ObjectStore;
import org.example.string.StringInterface;

import java.util.Scanner;

public class MergeStringsAlternately implements StringInterface, CommonInterface {

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please enter two space seperated words");

        String str = sc.nextLine();
        String[] words = separateWords(str);

        System.out.println(mergeStringsAlternately(words[0], words[1]));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private String mergeStringsAlternately(String word1, String word2){
        int minLength = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        int i = -1;
        while(i++ < minLength-1){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length() > word2.length()) sb.append(word1.substring(i));
        else if(word2.length() > word1.length()) sb.append(word2.substring(i));
        return sb.toString();
    }
}
