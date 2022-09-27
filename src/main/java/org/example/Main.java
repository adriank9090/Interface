package org.example;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.addToList(new Cat("Johny", "Bravo"));
        animal.addToList(new Dog("Rudy", "Brąz"));
        animal.getAnimalList().remove(0);
        System.out.println(animal.getAnimalList().toString());

    }
}