package com.sparta.jk;

public abstract class Trainee implements Trainable {
    public String name;
    public int age;
    public String email;
    public int phone;


    public Trainee(String name, int age, String email, int phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }
    
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
