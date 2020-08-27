package com.euler.examples;

public class UnicodeChars {
    public void getUnicode() {
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {

            if (Character.isDefined(i)) {
                System.out.println(Integer.toHexString(i) + ": " +
                new String(Character.toChars(i)));
            }
        }
    }
}
