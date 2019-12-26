package com.example.springmongocrud.model;

public class UserCredentials {
    private String nombre;
    private String password;

    public UserCredentials() {
    }

    public UserCredentials(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
}
