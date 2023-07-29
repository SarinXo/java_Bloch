package org.example.FabricMethod;

public class RandomClass {
    private int randomValue;

    private static RandomClass INSTANCE;

    private RandomClass(int randomValue) {
        this.randomValue = randomValue;
    }

    public static RandomClass of(int randomValue){
        return new RandomClass(randomValue);
    }

    public static RandomClass another(int randomValue){
        System.out.println("wow new instance!");
        return new RandomClass(randomValue);
    }

    public static RandomClass andAnotherOne(int randomValue){
        System.out.println("it's cool!");
        return new RandomClass(randomValue);
    }

    public static RandomClass singleCreate(int randomValue){
        if (INSTANCE == null) {
            return new RandomClass(randomValue);
        }
        return INSTANCE;

    }
}
