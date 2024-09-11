package org.example.ProjectSecond10;

interface E11AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();
}
abstract class Animal implements E11AnimalBehavior{
    String name;
    int age;
    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeping");
    }
    abstract void displayInfo();
}
abstract class Mammal extends Animal{
    public Mammal(String name,int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " Mammal is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Mammal is making a sound.");
    }
}
abstract class Bird extends Animal{
    public Bird(String name , int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " Bird is eating");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Bird is chirping.");
    }
}
  class Lion extends Mammal{
    public Lion(String name, int age){
        super(name, age);
    }

     @Override
     void displayInfo() {
         System.out.println("Lion Name: " + name + ", Age: " + age);
     }

     @Override
    public void makeSound() {
        System.out.println(name + " roars.");
    }
}
class Elephant extends Mammal{
    public Elephant (String name, int age){
        super(name,age);
    }

    @Override
    void displayInfo() {
        System.out.println("Elephant Name: " + name + ", Age: " + age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " trumpets!");
    }
}
class Parrot extends Bird{
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    void displayInfo() {
        System.out.println("Parrot Name: " + name + ", Age: " + age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says 'Hello!'");
    }
}
class Eagle extends Bird{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    void displayInfo() {
        System.out.println("Eagle Name: " + name + ", Age: " + age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " screeches!");
    }
}