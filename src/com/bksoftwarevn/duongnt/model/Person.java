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
    private byte status; //0 là hoạt động bt, 1 là bị khóa sau
    // bao nhiêu thời gian không đăng nhập lại thì sẽ bị xóa, 2 bị xóa
    // ở trạng thái khóa thì các người dùng khác sẽ không tìm kiếm được
    //thông tin ngoại trừ admin
    // ở trái thái xóa thì tất cả người dùng trong hệ thống đều không tìm
    //kiếm được
    //ở trạng thái xóa tài khoản sẽ không đăng nhập được
    //ở trạng thái khóa khi vẫn tính tồn tại email
    // ở trạng thái xóa thì tính không tại email
    private boolean admin; // true là admin, false người dùng bình thường


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Person(int id, String name, byte sex, String email, String password, String phoneNumber, String address, byte status, boolean admin) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.status = status;
        this.admin = admin;
    }

    public Person(int id, String name, byte sex, String email, String password, String phoneNumber, String address, boolean admin) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.admin = admin;
    }

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
