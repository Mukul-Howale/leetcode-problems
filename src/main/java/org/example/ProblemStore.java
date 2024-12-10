package org.example;

import org.example.constants.Constants;
import org.example.enums.DifficultyConstants;
import org.example.enums.TopicConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class ProblemStore {

    private static final Map<Integer, Problem> problemList = new HashMap<>();

    ProblemStore(){
        this.makeProblemList();
    }

    public Map<Integer, Problem> getProblemList(TopicConstants topicConstants, DifficultyConstants difficultyConstants){
        problemList.forEach((key, value) -> {
            if(value.getTopic().equals(topicConstants)
                    && value.getDifficulty()
                    .equals(difficultyConstants))
            System.out.println(key + " " + value.toString());
        });
        return new HashMap<>();
    }


    private Map<Integer, Problem> getAllArrayProblems(){

    }

    // Get all the classes implementing CommonInterface
    // 1. Add a file eg. 'org.example.CommonInterface' in resource/META-INF/services
    // 2. Add the classes names implementing the interface in the file
    private void makeProblemList(){
        ServiceLoader<CommonInterface> loader = ServiceLoader.load(CommonInterface.class);
        int i = Constants.getInitialIdx();
        for (CommonInterface implClass : loader) {
            String[] packageNames = implClass.getClass().getPackageName().split("\\.");
            Problem problem = new Problem(implClass,packageNames[2],packageNames[3]);
            problemList.put(++i, problem);
        }
    }
}
