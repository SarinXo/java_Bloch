package org.example.FabricMethod;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.EnumSet;

public class MainClass {
    protected int value;

    public MainClass(int value) {
        this.value = value;
    }

    //дает instance закрытого класса
    public static MainClass createClass(int value, int secondValue) {
        return new HiddenSubClass(value, secondValue);
    }

    //при разных аргументах может давать разные классы (это круто) ((да эта тема сама по себе прикольная))
    public static MainClass createClass(int value){
        return new MainClass(value);
    }

    @Contract(value = " -> new", pure = true)
    public static @NotNull ImportantInterface createClassWithInterface(){
        //for example
        return new IntClass();
    }

}
