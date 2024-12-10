package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class ProblemStore {

    Map<Integer, Problem> problemList = new HashMap<>();

    // Get all the classes implementing CommonInterface
    // 1. Add a file eg. 'org.example.CommonInterface' in resource/META-INF/services
    // 2. Add the classes names implementing the interface in the file
    public HashMap<Integer, Problem> getProblemList(){

        ServiceLoader<CommonInterface> loader = ServiceLoader.load(CommonInterface.class);
        int i = 0;
        for (CommonInterface implClass : loader) {
            String[] packageNames = implClass.getClass().getPackageName().split("\\.");
            Problem problem = new Problem(implClass,packageNames[2],packageNames[3]);
            problemList.put(++i, problem);
        }
        return problemList;
    }
}
