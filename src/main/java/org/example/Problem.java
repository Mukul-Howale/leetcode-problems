package org.example;

import org.example.enums.DifficultyConstants;
import org.example.enums.TopicConstants;

public class Problem {

    private static Integer id = 0;
    private CommonInterface problemName;
    private TopicConstants topic;
    private DifficultyConstants difficulty;

    public Problem(CommonInterface problemName, String topic, String difficulty) {
        id+=1;
        this.problemName = problemName;
        this.topic = TopicConstants.valueOf(topic);
        this.difficulty = DifficultyConstants.valueOf(difficulty);
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

    public TopicConstants getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = TopicConstants.valueOf(topic);
    }

    public DifficultyConstants getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = DifficultyConstants.valueOf(difficulty);
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
