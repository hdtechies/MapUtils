/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hdtechies.conversionstrategy.impl;

import org.hdtechies.conversionstrategy.ConversionStartegy;

/**
 *
 * @author HaRdik
 */
public class FirstLetterCapitalCaseConversionStartegy implements ConversionStartegy {

    @Override
    public String convert(String key) {
        Character c = key.charAt(0);
        return c.toString().toUpperCase() + key.toLowerCase().substring(1);
    }

}
