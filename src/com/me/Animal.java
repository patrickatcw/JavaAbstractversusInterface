package com.me;

//step 1 create class
//step 2 make an abstract class
public abstract class Animal {

    //step 3 define variables
    private String name;

    //step 4 constructor, which will pass as the name of the animal
    public Animal(String name) {
        this.name = name;
    }

    //step 5 adding abstract methods
    public abstract void eat();
    public abstract void breathe();

    //step 6 add a getter
    public String getName() {
        return name;

        //step 7 create dog class

    }
}