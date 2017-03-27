package com.itmo.utility;

/**
 * Created by asus on 27.03.17.
 */
abstract class UtilityClass {
    final static boolean find(char toFindWhat, String toFindWhere) {
        for (char tmp : toFindWhere.toCharArray()) {
            if (tmp == toFindWhat)
                return true;
        }
        return false;
    }
    final static String transform(String toTransform) {
        String generated = "";
        char[] generatedCharArray = new char[toTransform.length()];
        int i = 0;
        for (char tmp : toTransform.toCharArray()) {
            if (tmp != Character.toUpperCase(tmp)) {
                generatedCharArray[i] = Character.toUpperCase(tmp);
            } else {
                generatedCharArray[i] = Character.toLowerCase(tmp);
            }
            i++;
        }
        return new String(generatedCharArray);
    }
}
