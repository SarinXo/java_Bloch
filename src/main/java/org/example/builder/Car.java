package org.example.builder;

//Главное преимущество этой вариации Inner Class то, что мы создаем НЕиЗМЕНЯЕМЫЙ обьект для многопоточности
public class Car {
    private final int       capacity;
    private final double    litersOil;
    private final double    maxSpeed;
    private final int       var1;
    private final int       var2;
    private final int       var3;

    public Car(Builder builder) {
        capacity  = builder.capacity;
        litersOil = builder.litersOil;
        maxSpeed  = builder.maxSpeed;
        var1      = builder.var1;
        var2      = builder.var2;
        var3      = builder.var3;
    }

    public static class Builder{
        private int       capacity;
        private double    litersOil;
        private double    maxSpeed;
        private int       var1 = 1;
        private int       var2 = 2;
        private int       var3 = 3;

        public Builder setCapacity(int capacity){
            this.capacity = capacity;
            return this;
        }

        public Builder setLitersOil(double litersOil) {
            this.litersOil = litersOil;
            return this;
        }

        public Builder setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setVar1(int var1) {
            this.var1 = var1;
            return this;
        }

        public Builder setVar2(int var2) {
            this.var2 = var2;
            return this;
        }

        public Builder setVar3(int var3) {
            this.var3 = var3;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }


}
