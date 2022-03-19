package ru.appline.logic;

public class Compass {

    private String degree;

    public Compass() {
        super();
    }

    public Compass(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

//    "North": "337-21",
//    "NorthEast": "22-66",
//    "East": "67-111",
//    "SouthEast": "112-156",
//    "South": "157-201",
//    "SouthWest": "202-246",
//    "West": "247-291",
//    "NorthWest": "292-336"
}
