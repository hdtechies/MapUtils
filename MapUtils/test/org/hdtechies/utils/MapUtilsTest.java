/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hdtechies.utils;

import java.util.HashMap;
import java.util.Map;
import org.hdtechies.conversionstrategy.impl.FirstLetterCapitalCaseConversionStartegy;
import org.hdtechies.model.Person;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HaRdik
 */
public class MapUtilsTest {

    @Test
    public void testConvertMapToPojo_2args() throws Exception {
        Map<String, Object> map = new HashMap<>();

        map.put("name", "Hardik");
        map.put("salary", 10000D);
        map.put("dob", "10-10-1990");
        map.put("married", false);

        Person person = MapUtils.convertMapToPojo(map, Person.class);
        System.out.println(" person " + person);

        Map<String, Object> map1 = new HashMap<>();

        map1.put("NAME", "Hardik");
        map1.put("SALARY", 10000D);
        map1.put("DOB", "10-10-1990");
        map1.put("MARRIED", false);

        Person person1 = MapUtils.convertMapToPojo(map1, Person.class, new FirstLetterCapitalCaseConversionStartegy());
        System.out.println(" person1 " + person1);
        assertNotNull(person1);
    }

}
