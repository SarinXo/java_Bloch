package org.example.FabricMethod;

public class ConstructorsWithMeaning {
    private int value;

    private ConstructorsWithMeaning(int value){
        this.value = value;
    }

    // of == convert
    public static ConstructorsWithMeaning from(double value){
        return new ConstructorsWithMeaning((int) value);
    }

    //агрегация или создание обьекта из того же типа что и переменная внутри
    public static ConstructorsWithMeaning of(int value){
        return new ConstructorsWithMeaning( value);
    }

    //условно можно поделить на 2 вида - вызываемые из самих классов или вызываемые из других классов

    //valueOf - так же может быть использована в качестве альтернативы from, of
    // instance, getInstance - обычно используются в совокупности с какими-то параметрами

    //create, newInstance - ГАРАНТИРУЮТ, что предоставленныи обьект будет НОВЫМ

    // get(Type), type где Type - класс/абстрактный класс/интерфейс - обычно находится в другом классе
    // List<Object> list = Arrays.asList(1, 2);
    // new(Type) - для подчеркивания


}
