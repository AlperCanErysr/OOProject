package com.can_erysr.ooproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        UserClass myUser1 = new UserClass();
        myUser1.name="Alper Can";
        myUser1.job="Junior Software Developer";

        UserClass myUser2 = new UserClass();
        myUser2.name="Atil";
        myUser2.job="Instructor";
        */

        UserClass myUser1 = new UserClass("Alper Can","Junior Software Develper");
        UserClass myUser2 = new UserClass("Atıl","Intructor");
        System.out.println(myUser1.information());


        System.out.println("User 1 name is " + myUser1.name);


        //Emcapsulation
        MusicianClass musician1 = new MusicianClass("James","Guitar",50);
        System.out.println(musician1.getName());
        musician1.setAge(120,"Alper Can");
        System.out.println(musician1.getAge());


        //Inheritance
        SuperMusicianClass lars = new SuperMusicianClass("Lars","Drums",45);
        System.out.println(lars.sing());
        System.out.println(lars.getName());


        //Polymorphism
        //Static Polymorphism
        MathClass mathClass1 = new MathClass();
        System.out.println(mathClass1.sum());
        System.out.println(mathClass1.sum(5,5));
        System.out.println(mathClass1.sum(3,4,5));

        //Dynamic Polymorphism
        AnimalClass myAnimal = new AnimalClass();
        myAnimal.sing();

        DogClass myDog = new DogClass();
        myDog.test();
        myDog.sing();


        //Abstract & Interface
        PianoClass pianoClass1 = new PianoClass();
        pianoClass1.brand="Yamaha";
        pianoClass1.digital=true;
        pianoClass1.info();





    }
}