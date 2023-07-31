package org.example.FabricMethod;

public class HiddenSubClass extends MainClass {
    protected int secondValue;

    protected HiddenSubClass(int value, int secondValue) {
        super(value);
        this.secondValue = secondValue;
    }
}
