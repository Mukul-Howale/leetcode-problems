package org.example.problem.string;

public interface StringInterface {

    default String[] separateWords(String str){
        return str.split(" ");
    }
}
