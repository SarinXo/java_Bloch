package org.example.clone;

import java.util.Objects;

public class HashTable<K, V> implements Cloneable{
    private Entry<K, V>[] buckets;

    public HashTable(int length) {
        this.buckets = new Entry[length];
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        private Entry<K, V> deepCopy(){
            return new Entry<K, V>(key, value,
                    Objects.isNull(next) ? null : next.deepCopy());
        }
    }

    @Override
    public HashTable<K, V> clone(){
        try{

            HashTable<K, V> result = (HashTable<K, V>) super.clone();//какая-то лажа
            result.buckets = new Entry[buckets.length];

            for(int i = 0; i < buckets.length; i++)
                if(buckets[i]!= null){
                    result.buckets[i]=buckets[i].deepCopy();
                }
            return result;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
