package org.example.string;

public interface StringInterface {

    default String[] separateWords(String str){
        return str.split(" ");
    }
}
