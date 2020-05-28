package com.bksoftwarevn.duongnt.model;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private byte sex; //0 là nam, 1 là nữa, 2 là khác
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private boolean admin;

    public Person() {
    }

    public Person(String name) {
        this.id = id;
        this.name = name;
    }

    public void printThis() {
        System.out.println(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int id, String name, byte sex, String email, String password, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public byte getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
