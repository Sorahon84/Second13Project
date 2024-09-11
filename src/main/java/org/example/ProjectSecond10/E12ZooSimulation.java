package org.example.ProjectSecond10;

public class E12ZooSimulation {
    public static void main(String[] args) {
        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 11);
        Animal parrot = new Parrot("Polly", 1);
        Animal eagle = new Eagle("Abbie", 3);
        Animal[] animals = {lion, elephant, parrot, eagle};
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.eat();
            animal.sleep();
            animal.makeSound();
            System.out.println();
        }
    }
}
