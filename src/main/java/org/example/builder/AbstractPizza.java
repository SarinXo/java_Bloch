package org.example.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class AbstractPizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    protected final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract AbstractPizza build();

        // Подклассы должны перекрывать этот метод, возвращая "себя"
        protected abstract T self();
    }

    AbstractPizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
