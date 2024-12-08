package org.example;

import java.util.Scanner;

public interface CommonInterface {

    void solve();

    default void initialMessage(CommonInterface commonInterface){
        System.out.println("\n" + commonInterface.getClass().getSimpleName());
        System.out.println("Note : To know about the question, please refer the README file \n");
    }

    default void exitOrBack(Execute ex){
        System.out.println("1. Go back to list");
        System.out.println("2. Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) ex.start();
        else System.out.println("Ok, Bye!");
        sc.close();
    }
}
