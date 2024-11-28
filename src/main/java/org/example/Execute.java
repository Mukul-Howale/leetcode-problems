package org.example;

import org.example.array.ArrayInterface;

import java.util.HashMap;
import java.util.ServiceLoader;

public class Execute {
    private final HashMap<String, ArrayInterface> problemList;

    Execute(){
        this.problemList = getProblemList();
    }

    public void start() {
        if(problemList.containsKey("Two Sum")){
            ArrayInterface arrayInterface = problemList.get("Two Sum");
            arrayInterface.getObject().solve();
        }
    }

    private HashMap<String,  ArrayInterface> getProblemList(){
        ServiceLoader<ArrayInterface> loader = ServiceLoader.load(ArrayInterface.class);
        for (ArrayInterface implClass : loader) {
            System.out.println(implClass.getClass());
            this.problemList.put(implClass.getClass().getSimpleName(), implClass);
        }
        return problemList;
    }
}
