package com.example.planetsapp;

//This class is acting as Model Class for our ListView
public class Planet {

    //Attributes
    private String planetName;
    private String moonCount;

    private int planetImage;


    //Constructor
    public Planet(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

    //Getters & Setters

    public String getPlanetName() {
        return planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
