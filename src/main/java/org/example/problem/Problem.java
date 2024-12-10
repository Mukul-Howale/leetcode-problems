package org.example.problem;

import org.example.CommonInterface;
import org.example.enums.DifficultyEnum;
import org.example.enums.TopicEnum;

public class Problem {

    private static Integer id = 0;
    private final CommonInterface problemName;
    private final TopicEnum topic;
    private final DifficultyEnum difficulty;

    public Problem(CommonInterface problemName, String topic, String difficulty) {
        id+=1;
        this.problemName = problemName;
        this.topic = TopicEnum.valueOf(topic.toUpperCase());
        this.difficulty = DifficultyEnum.valueOf(difficulty.toUpperCase());
    }

    public CommonInterface getProblemName() {
        return problemName;
    }

    public TopicEnum getTopic() {
        return topic;
    }

    public DifficultyEnum getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "problemName=" + problemName +
                ", topic='" + topic + '\'' +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
