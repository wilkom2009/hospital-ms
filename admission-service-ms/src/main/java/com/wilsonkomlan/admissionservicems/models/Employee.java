package com.wilsonkomlan.admissionservicems.models;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String specility;

    public Employee() {

    }

    public Employee(String id, String firstName, String lastName, String specility) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specility = specility;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecility() {
        return this.specility;
    }

    public void setSpecility(String specility) {
        this.specility = specility;
    }

}
