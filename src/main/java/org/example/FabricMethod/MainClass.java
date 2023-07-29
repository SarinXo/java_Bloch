package org.example.FabricMethod;

public class MainClass {
    protected int value;

    public MainClass(int value) {
        this.value = value;
    }

    public static MainClass createSubClass(int value, int secondValue){
        return new SubClass(value, secondValue);
    }
}
