package org.example.problem.recursion;

import java.util.Arrays;

public interface RecursionInterface {

    default int[] getNums(String numString){
        String[] stringNums = numString.split(" ");
        return Arrays.stream(stringNums).mapToInt(Integer::parseInt).toArray();
    }
}
