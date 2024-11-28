package org.example;

import java.util.Arrays;
import java.util.Scanner;

public interface ArrayInterface {
    void solve();

    ArrayInterface getObject();

    default void initialMessage(){
        System.out.println("\n" + getObject().getClass().getSimpleName());
        System.out.println("Note : To know about the question, please refer the README file \n");
    }

    // Convert string into int array
    default int[] getNums(String numString){
        String[] stringNums = numString.split(" ");
        return Arrays.stream(stringNums).mapToInt(Integer::parseInt).toArray();
    }

    default void exitOrBack(Execute ex){
        System.out.println("1. Go back to list");
        System.out.println("2. Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            ex.start();
        } else {
            System.out.println("Ok, Bye!");
        }
        sc.close();
    }
}
