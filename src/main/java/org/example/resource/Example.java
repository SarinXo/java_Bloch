package org.example.resource;

import java.util.regex.Pattern;

    //чьи операции дорогие, мы можем выносить и переиспользовать
public class Example {
    private static final Pattern ROMAN =
            Pattern.compile("Л(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]IL?X{0,3})(I[XV]|V?I{0,3})$");
    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

}
