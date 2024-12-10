package org.example;

public class Problem {

    private static Integer id = 0;
    private CommonInterface problemName;
    private String topic;
    private String difficulty;

    public Problem(CommonInterface problemName, String topic, String difficulty) {
        id+=1;
        this.problemName = problemName;
        this.topic = topic;
        this.difficulty = difficulty;
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
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
