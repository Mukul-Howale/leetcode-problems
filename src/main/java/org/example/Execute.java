package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Execute {
    private final HashMap<Integer, ArrayInterface> problemList;

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
        
        // Get all the classes implementing ArrayInterface
        // 1. Add a file eg. 'org.example.ArrayInterface' in resource/META-INF/services
        // 2. Add the classes names implementing the interface in the file
        if(problemList.containsKey(option)){
            ArrayInterface arrayInterface = problemList.get(option);
            arrayInterface.getObject().solve();
        }

        sc.close();
    }

    private HashMap<Integer, ArrayInterface> getProblemList(){
        HashMap<Integer, ArrayInterface> problemList = new HashMap<>();
        ServiceLoader<ArrayInterface> loader = ServiceLoader.load(ArrayInterface.class);
        int i = 0;
        for (ArrayInterface implClass : loader) {
            problemList.put(++i, implClass);
        }
        return problemList;
    }
}
