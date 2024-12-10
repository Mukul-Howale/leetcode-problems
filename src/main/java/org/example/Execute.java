package org.example;

import org.example.constants.Constants;
import org.example.enums.DifficultyConstants;
import org.example.enums.TopicConstants;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Execute {
    private ProblemStore problemStore;

    Execute(){
        this.problemStore = new ProblemStore();
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

        System.out.println("Select topic : ");
        Map<Integer, TopicConstants> topics = new HashMap<>();
        AtomicInteger topicIdx = new AtomicInteger(Constants.getInitialIdx());
        Arrays.asList(TopicConstants.values()).forEach(topic -> {
            topics.put(topicIdx.incrementAndGet(), topic);
            System.out.println(topicIdx.get() + ". " + topic.toString());
        });
        TopicConstants topicConstants = topics.get(sc.nextInt());

        System.out.println("\nSelect difficulty : ");
        Map<Integer, DifficultyConstants> difficulties = new HashMap<>();
        AtomicInteger difficultyIdx = new AtomicInteger(Constants.getInitialIdx());
        Arrays.asList(DifficultyConstants.values()).forEach(difficulty -> {
            difficulties.put(difficultyIdx.incrementAndGet(), difficulty);
            System.out.println(difficultyIdx.get() + ". " + difficulty.toString());
        });
        DifficultyConstants difficultyConstants = difficulties.get(sc.nextInt());

        Map<Integer, Problem> ProblemList = problemStore.getProblemList(topicConstants, difficultyConstants);



//        if(problemList.containsKey(option)){
//            CommonInterface commonInterface = problemList.get(option);
//            commonInterface.solve();
//        }
    }
}
