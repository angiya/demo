package com.example.demo.entity;

public enum Breed {
    GOLDEN_RETRIEVER("Golden Retriever"),
    LABRADOR("Labrador Retriever"),
    ROTTWEILER("Rottweiler"),
    GERMAN_SHEPHERD("German Shepherd"),
    BULLDOG("Bulldog"),
    BEAGLE("Beagle"),
    GREAT_DANE("Great Dane"),
    SIBERIAN_HUSKY("Siberian Husky"),
    BOARDER_COLLIE("Boarder Collie");


    private final String displayName;

    Breed(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    @Override
    public String toString() { return displayName; }
}
