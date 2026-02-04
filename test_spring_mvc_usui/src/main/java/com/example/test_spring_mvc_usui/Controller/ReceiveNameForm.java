package com.example.test_spring_mvc_usui.Controller;

public class ReceiveNameForm {

    private String name;

    public ReceiveNameForm(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "name = " + name;
    }
}
