/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hdtechies.model;

/**
 *
 * @author HaRdik
 */
public class Person {

    private String name;
    private String dob;
    private double salary;
    private boolean married;

    public boolean isMarried() {
        return married;
    }

    public Person() {
    }

    public Person(String name, String dob, double salary, boolean married) {
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", dob=" + dob + ", salary=" + salary + ", married=" + married + '}';
    }

}
