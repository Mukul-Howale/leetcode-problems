package org.example.problem;

import org.example.CommonInterface;
import org.example.constants.Constants;
import org.example.enums.DifficultyEnum;
import org.example.enums.TopicEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class ProblemStore {

    private static final Map<Integer, Problem> problemList = new HashMap<>();

    public ProblemStore(){
        this.makeProblemList();
    }

    /**
     * TO-DO
        Trying to remove if-else statements
     */
    public Map<Integer, Problem> getProblemList(TopicEnum topicEnum, DifficultyEnum difficultyEnum){
        Map<Integer, Problem> filteredProblemList = new HashMap<>();
        if(topicEnum.equals(TopicEnum.ALL) && difficultyEnum.equals(DifficultyEnum.ALL)) return problemList;
        else if(topicEnum.equals(TopicEnum.ALL)){
            problemList.forEach((key, value) ->{
                if(value.getDifficulty().equals(difficultyEnum)) filteredProblemList.put(key, value);
            });
        }
        else if(difficultyEnum.equals(DifficultyEnum.ALL)){
            problemList.forEach((key, value) ->{
                if(value.getTopic().equals(topicEnum)) filteredProblemList.put(key, value);
            });
        }
        else{
            problemList.forEach((key, value) -> {
                if(value.getTopic().equals(topicEnum)
                        && value.getDifficulty()
                        .equals(difficultyEnum))
                    filteredProblemList.put(key,value);
            });
        }
        return filteredProblemList;
    }

    /**
        Get all the classes implementing CommonInterface
        1. Add a file e.g. 'org.example.CommonInterface' in resource/META-INF/services
        2. Add the classes names implementing the interface in the file
     */
    private void makeProblemList(){
        ServiceLoader<CommonInterface> loader = ServiceLoader.load(CommonInterface.class);
        int i = Constants.getInitialIdx();
        for (CommonInterface implClass : loader) {
            String[] packageNames = implClass.getClass().getPackageName().split("\\.");
            Problem problem = new Problem(implClass,packageNames[Constants.getTopicStringIdx()],packageNames[Constants.getDifficultyStringIdx()]);
            problemList.put(++i, problem);
        }
    }
}
