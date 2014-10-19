/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hdtechies.conversionstrategy.impl;

import org.hdtechies.conversionstrategy.KeyNameConversionStartegy;

/**
 *
 * @author HaRdik
 */
public class CamelCaseConversionStrategy implements KeyNameConversionStartegy {

    @Override
    public String convert(String key) {
        return removeFirstCapitalLetter(key);
    }

    private static String removeFirstCapitalLetter(String s) {
        Character c = s.charAt(0);
        return c.toString().toLowerCase() + s.substring(1);
    }
}
