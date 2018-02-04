package com.company;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration; //toString is part of the Object class that is extended by all other Objects
        //Number represents the memory location
        //That's why it needs to be overridden
    }
}
