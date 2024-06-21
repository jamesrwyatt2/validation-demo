package com.jwctech.validationdemo;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class User {

    @NotNull(message = "name can not be empty")
    @Size(min = 3, max = 30, message = "Name must be 3 to 30 characters")
    public String name;

    @NotNull(message = "Password can not be empty")
    @Size(min = 3, message = "Password to small")
    @Size(max = 30, message = "Password to large")
    public String password;

    @NotNull(message = "Email can not be empty")
    @Size(min = 3, message = "email to short")
    @Email(message = "not valid Email")
    public String email;

    public User() {};

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
