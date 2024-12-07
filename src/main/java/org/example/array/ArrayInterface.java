package org.example.array;

import org.example.Execute;

import java.util.Arrays;
import java.util.Scanner;

public interface ArrayInterface {

    // Convert string into int array
    default int[] getNums(String numString){
        String[] stringNums = numString.split(" ");
        return Arrays.stream(stringNums).mapToInt(Integer::parseInt).toArray();
    }
}
