package org.example.FabricMethod;

public class SubClass extends MainClass {
        protected int secondValue;

    public SubClass(int value, int secondValue) {
        super(value);
        this.secondValue = secondValue;
    }
}
