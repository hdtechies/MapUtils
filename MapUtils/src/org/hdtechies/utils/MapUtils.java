/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hdtechies.utils;

import java.lang.reflect.Method;
import java.util.Map;
import org.hdtechies.conversionstrategy.ConversionStartegy;

/**
 *
 * @author HaRdik
 */
public class MapUtils {

    private final static String SET = "set";

    public static <T> T convertMapToPojo(Map<String, Object> map, Class<T> t) throws Exception {
        T x = t.newInstance();
        Method[] methods = x.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith(SET)) {
                Object value = map.get(removeFirstCapitalLetter(method.getName().substring(SET.length())));
                if (value != null) {
                    method.invoke(x, value);
                }
            }
        }
        return x;
    }

    public static <T> T convertMapToPojo(Map<String, Object> map, Class<T> t, ConversionStartegy conversionStartegy) throws Exception {
        T x = t.newInstance();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String newKey = conversionStartegy.convert(entry.getKey());
            Object value = map.get(entry.getKey());
            if (value != null) {
                Method methods[] = x.getClass().getMethods();
                for (Method method : methods) {
                    System.out.println(" " + method.getName());
                    System.out.println(" " + SET + newKey.trim());
                    if (method.getName() == SET + newKey.trim()) {
                        System.out.println(" rue");
                        method.invoke(x, value);
                    }
                }
            }

        }
        return x;
    }

    private static String removeFirstCapitalLetter(String s) {
        Character c = s.charAt(0);
        return c.toString().toLowerCase() + s.substring(1);
    }

}
