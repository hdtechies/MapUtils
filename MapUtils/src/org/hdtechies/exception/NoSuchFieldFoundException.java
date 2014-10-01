/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hdtechies.exception;

/**
 *
 * @author HaRdik
 */
public class NoSuchFieldFoundException extends Exception {

    public NoSuchFieldFoundException() {
    }

    public NoSuchFieldFoundException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
}
