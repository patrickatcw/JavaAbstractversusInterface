package com.me;

//step 7 create dog class
//step 8 extends animal
public class Dog extends Animal{

    //step 9 constructor
    public Dog(String name) {
        super(name);
    }

    //step 10 overrides
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breate in, breathe out, repeat");

        //step 11 to main

    }
}

