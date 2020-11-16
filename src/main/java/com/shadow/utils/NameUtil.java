package com.shadow.utils;

/**
 * @author shadow
 * <p>
 * 2019-07-29
 */
public class NameUtil {

    public static String upcase(String name) {
        StringBuilder sb = new StringBuilder();
        char[] chs = name.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (i == 0) {
                sb.append((char) (chs[i] - 32));
            } else {
                sb.append(chs[i]);
            }
        }
        return sb.toString();
    }

}
