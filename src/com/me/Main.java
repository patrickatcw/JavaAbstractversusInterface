package com.me;
//continued from JavaAbstractClassesSimple
public class Main {

    public static void main(String[] args) {

        //step 11 an instance
        Dog dog = new Dog("Yorkie");

        //step 12 calling methods
        dog.breathe();
        dog.eat();

        //step 13 run
        /*
        results;
        Breathe in, breathe out, repeat
        Yorkie is eating
         */

        //step 14 create a bird class

        //step 18 an instance
        //Bird bird = new Bird("Parrot");
        //step 27 change from bird to parrot
        Parrot parrot = new Parrot("Rican Tucan");

        //step 19 calling methods
        //bird.breathe();
        //bird.eat();
        //step 28 change from bird to parrot
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        //step 29 run
        /*
        results;
        Breathe in, breathe out, repeat
        Rican Tucan is pecking
        Flitting from branch to branch
         */

        //step 30 create penguin class

        //step 34 instance for penguin
        Penguin penguin = new Penguin("Emperor");

        //step 35 calling method for penguin
        penguin.fly();

        //step 36 run
        /*
        results;
        I'm a penguin, not so good at flying
         */
        //done!

        //step 20 run
        /*
        results;
        Breate in, breathe out, repeat
        Parrot is pecking
         */

        //step 21 to bird class to modify

    }

}

