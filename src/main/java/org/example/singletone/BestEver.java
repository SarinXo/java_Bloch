package org.example.singletone;

public enum BestEver {
    INSTANCE;

    public BestEver getInstance(){
        return INSTANCE;
    }
}
