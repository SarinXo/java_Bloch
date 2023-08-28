package org.example.clone;

public class PhoneNumber implements Cloneable {
    //без интерфейса clone
    @Override
    public PhoneNumber clone(){
        try {
            return (PhoneNumber) super.clone();
        }catch (CloneNotSupportedException e) {
            throw new AssertionError(); //can't happen
        }
    }
}
