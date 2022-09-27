package org.example;

import java.util.ArrayList;
import java.util.List;

public class Animal<T> implements Operations {

    private List<T> animalList;

    public Animal() {
        this.animalList = new ArrayList<>();
    }

    @Override
    public void addToList(Object obj) {
        animalList.add((T)obj);
    }

    @Override
    public void removeFromList(Object obj) {
        animalList.remove((T)obj);
    }

    public List<T> getAnimalList() {
        return animalList;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalList=" + animalList +
                '}';
    }
}
