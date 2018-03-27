package com.me;

//note; parrot is automatically inheriting from bird
//step 23 new parrot class created
//step 24 extends
public class Parrot extends Bird{

    //step 25 constructor
    public Parrot(String name) {
        super(name);
    }

    //step 26 override method fly
    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");

        //step 27 back to main

    }
}
