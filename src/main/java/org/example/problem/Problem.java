package org.example.problem;

import org.example.CommonInterface;
import org.example.enums.DifficultyEnum;
import org.example.enums.TopicEnum;

public class Problem {

    private static Integer id = 0;
    private CommonInterface problemName;
    private TopicEnum topic;
    private DifficultyEnum difficulty;

    public Problem(CommonInterface problemName, String topic, String difficulty) {
        id+=1;
        this.problemName = problemName;
        this.topic = TopicEnum.valueOf(topic.toUpperCase());
        this.difficulty = DifficultyEnum.valueOf(difficulty.toUpperCase());
    }

    public Integer getId(){
        return id;
    }

    public CommonInterface getProblemName() {
        return problemName;
    }

    public void setProblemName(CommonInterface problemName) {
        this.problemName = problemName;
    }

    public TopicEnum getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = TopicEnum.valueOf(topic);
    }

    public DifficultyEnum getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = DifficultyEnum.valueOf(difficulty);
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
