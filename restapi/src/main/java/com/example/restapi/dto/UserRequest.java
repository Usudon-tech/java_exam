package com.example.restapi.dto;

import jakarta.validation.constraints.NotBlank;

// Request用DTOクラスの作成
public class UserRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String email;

    public UserRequest(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "name = " + name + ", email = " + email;
    }   
}
