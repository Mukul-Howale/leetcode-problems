package org.example;

import java.util.*;

public class Execute {
    private final Map<Integer, Problem> problemList;

    Execute(){
        this.problemList = getProblemList();
    }

//    public void start() {
//        System.out.println("Here are the list of problems : ");
//
//        problemList.forEach((key, value) -> {
//            System.out.println(key + ". " + value.getClass().getSimpleName());
//        });
//
//        System.out.println("Select a problem");
//        Scanner sc = new Scanner(System.in);
//        int option = sc.nextInt();
//
//        if(problemList.containsKey(option)){
//            CommonInterface commonInterface = problemList.get(option);
//            commonInterface.solve();
//        }
//
//        sc.close();
//    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select one : ");

        problemList.forEach((key, value) -> {
            System.out.println(key + " " + value.toString());
        });

//        if(problemList.containsKey(option)){
//            CommonInterface commonInterface = problemList.get(option);
//            commonInterface.solve();
//        }
    }
}
