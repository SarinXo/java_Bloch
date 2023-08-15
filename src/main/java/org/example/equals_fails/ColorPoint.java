package org.example.equals_fails;

public class ColorPoint extends Point{
    String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj){
        //нарушается транзитивность! мы можем вызывать метод от Point и им сравнивать ColorPoint
        //а при вызове от ColorPoint мы получим ошибку преобразования класса
        // но если мы не будем наследовать и создадим новый метод только для ColorPoint. то
        //нарушим подстановки Лисков
        return super.equals(obj) &&
                color.equals(((ColorPoint) obj).color);
    }
}
