package com.main;

abstract class Animal{
    //abstract method
    public abstract void sound();

}
class Horce extends Animal{

    public void run(){ System.out.println("Игого, я поскакал(а)"); }

    @Override
    public void sound() {
    }
}
class Pegasus extends Animal{

    public void fly(){ System.out.println("Игого, я полетел(а)"); }

    @Override
    public void sound() {

    }
}
public class Main {
    public static void main(String[] args)  {
     Horce Horce = new Horce();
     Horce.run();
     Pegasus Pegasus = new Pegasus();
     Pegasus.fly();
    }
}
