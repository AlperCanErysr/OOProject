package com.can_erysr.ooproject;

public class UserClass extends PeopleClass{

    //Property
    String name;
    String job;

    //Constructor


    public UserClass(String nameInput, String jobInput) {
        this.name = nameInput;
        this.job = jobInput;

        System.out.println("User Created");
    }
}
