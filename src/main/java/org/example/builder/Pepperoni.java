package org.example.builder;


import javax.xml.stream.XMLStreamReader;
import java.util.Objects;

public class Pepperoni extends AbstractPizza{

    public enum Size{SMALL, MEDIUM, LARGE}

    private final Size size;

    public Pepperoni(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public static class Builder extends AbstractPizza.Builder<Builder>{
        private Size size;

        @Override
        AbstractPizza build() {
            return new Pepperoni(this);
        }

        public Builder setSize(Size size) {
            this.size = Objects.requireNonNull(size);
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
