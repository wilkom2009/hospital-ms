package com.wilsonkomlan.pathologyservicems.models;

public class Disease {

    private String id;
    private String description;
    private String treatment;

    public Disease() {
    }

    public Disease(String id, String description, String treatment) {
        this.id = id;
        this.description = description;
        this.treatment = treatment;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTreatment() {
        return this.treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

}
