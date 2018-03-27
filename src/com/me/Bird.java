package com.me;

//step 14 create bird class
//step 15 extend
//step 21 make abstract
public abstract class Bird extends Animal{

    //step 16 constructor
    public Bird(String name) {
        super(name);
    }

    //step 17 override those methods
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

        //step 18 to main

    }

    //step 22 add another abstract method
    public abstract void fly();

    //step 23 to main, look at error created on bird instance,
    //so create a new class parrot


}
