package org.example;

import org.example.constants.Constants;
import org.example.enums.DifficultyEnum;
import org.example.enums.TopicEnum;
import org.example.problem.Problem;
import org.example.problem.ProblemStore;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Execute {
    private final ProblemStore problemStore;

    Execute(){
        this.problemStore = new ProblemStore();
    }

    public void start(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect topic : ");
        Map<Integer, TopicEnum> topics = new HashMap<>();
        AtomicInteger topicIdx = new AtomicInteger(Constants.getInitialIdx());
        Arrays.asList(TopicEnum.values()).forEach(topic -> {
            topics.put(topicIdx.incrementAndGet(), topic);
            System.out.println(topicIdx.get() + ". " + topic.toString());
        });
        TopicEnum topicEnum = topics.get(sc.nextInt());

        System.out.println("\nSelect difficulty : ");
        Map<Integer, DifficultyEnum> difficulties = new HashMap<>();
        AtomicInteger difficultyIdx = new AtomicInteger(Constants.getInitialIdx());
        Arrays.asList(DifficultyEnum.values()).forEach(difficulty -> {
            difficulties.put(difficultyIdx.incrementAndGet(), difficulty);
            System.out.println(difficultyIdx.get() + ". " + difficulty.toString());
        });
        DifficultyEnum difficultyEnum = difficulties.get(sc.nextInt());

        System.out.println();

        Map<Integer, Problem> problemList = problemStore.getProblemList(topicEnum, difficultyEnum);
        problemList.forEach((key, value) -> {
            System.out.println(key + ". " + value.getProblemName().getClass().getSimpleName());
        });

        int option = sc.nextInt();

        if(problemList.containsKey(option)){
            CommonInterface commonInterface = problemList.get(option).getProblemName();
            commonInterface.solve();
        }
    }
}
