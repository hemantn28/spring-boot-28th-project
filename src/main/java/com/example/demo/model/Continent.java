package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name= "Continent_Earth")
public class Continent {

    @Id
    @GeneratedValue
    int id;
    String name;
    int totalNoOfNations;

    public Continent() {
    }

    public Continent(String name, int totalNoOfNations) {
        this.name = name;
        this.totalNoOfNations = totalNoOfNations;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalNoOfNations() {
        return totalNoOfNations;
    }

    public void setTotalNoOfNations(int totalNoOfNations) {
        this.totalNoOfNations = totalNoOfNations;
    }
}
