package org.example;

public class ObjectStore {
    private static Execute ex;

    public ObjectStore(){}

    public ObjectStore(Execute ex){
        ObjectStore.ex = ex;
    }

    public Execute getEx(){
        return ex;
    }
}
