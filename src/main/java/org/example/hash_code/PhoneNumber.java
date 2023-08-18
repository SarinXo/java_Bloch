package org.example.hash_code;

public class PhoneNumber {
    private Short prefix;
    private Short areaCode;
    private Short lineNum;

    //com.google.common.hash.Hashing меньше всего коллизий
    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);
        return result;
    }
}
