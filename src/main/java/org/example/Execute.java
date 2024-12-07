package org.example;

import org.example.array.ArrayInterface;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Execute {
    private final HashMap<Integer, CommonInterface> problemList;

    Execute(){
        this.problemList = getProblemList();
    }

    public void start() {
        System.out.println("Here are the list of problems : ");

        problemList.forEach((key, value) -> {
            System.out.println(key + ". " + value.getClass().getSimpleName());
        });

        System.out.println("Select a problem");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(problemList.containsKey(option)){
            CommonInterface commonInterface = problemList.get(option);
            commonInterface.getObject().solve();
        }

        sc.close();
    }

    // Get all the classes implementing CommonInterface
    // 1. Add a file eg. 'org.example.CommonInterface' in resource/META-INF/services
    // 2. Add the classes names implementing the interface in the file
    private HashMap<Integer, CommonInterface> getProblemList(){
        HashMap<Integer, CommonInterface> problemList = new HashMap<>();
        ServiceLoader<CommonInterface> loader = ServiceLoader.load(CommonInterface.class);
        int i = 0;
        for (CommonInterface implClass : loader) {
            problemList.put(++i, implClass);
        }
        return problemList;
    }
}
