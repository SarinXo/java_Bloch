package org.example.clone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        HashTable<Integer, String> hstb = new HashTable<>(10);
        var hstb2 = hstb.clone();

    }
}


