package com.can_erysr.ooproject;

public class PianoClass implements Instrument,HouseDecor{

    String brand;
    boolean digital;


    @Override
    public void info() {
        System.out.println("Override Methods");
    }
}
