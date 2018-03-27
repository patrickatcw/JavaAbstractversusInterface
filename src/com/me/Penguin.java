package com.me;

//step 30 class created
//step 31 extends from bird
public class Penguin extends Bird{

    //step 32 constructor
    public Penguin(String name) {
        super(name);
    }

    //step 33 override
    @Override
    public void fly() {
        System.out.println("I'm a penguin, not so good at flying");


        //step 34 to main
    }
}

