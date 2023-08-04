package org.example.singletone;

import java.io.Serial;
import java.io.Serializable;

public class SerizlizableSingletone implements Serializable {

    private static final SerizlizableSingletone INSTANCE = new SerizlizableSingletone(5);
    private final transient int state;

    private SerizlizableSingletone(int state){
        this.state = state;
    }

    public static SerizlizableSingletone getInstance(){
        return INSTANCE;
    }

    @Serial
    private Object readResolve(){
        //Возвращает истинный обьект и таким образом
        //Сборщик мусора забирает созданный с помощью сериализации обьект
        return INSTANCE;
    }
}
