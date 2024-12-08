package org.example.array;

import java.util.Arrays;

public interface ArrayInterface {

    // Convert string into int array
    default int[] getNums(String numString){
        String[] stringNums = numString.split(" ");
        return Arrays.stream(stringNums).mapToInt(Integer::parseInt).toArray();
    }
}
