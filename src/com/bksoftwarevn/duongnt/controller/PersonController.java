package com.bksoftwarevn.duongnt.controller;

import com.bksoftwarevn.duongnt.model.Person;

import java.util.Scanner;

public class PersonController {

    Scanner sc = new Scanner(System.in);


    //signIn
    public Person signIn() {
        Person p = null;
        return p;
    }

    //signUp
    public Person signUp() {
        Person p = null;
        return p;
    }

    public boolean checkInitEmail() {
        boolean rs = false;
        return rs;
    }

    public String checkEmail() {
        String email="";
        while (true) {
            printInput("email");
            email = new Scanner(System.in).nextLine();
            if (email.matches(" ^[a-zA-Z][a-zA-Z0-9_\\.]{5,32}@ [a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,3}$" ))
                break;
            printError("email");
        }
        return email;
    }

    public byte checkSex(){
        byte sex = 0;
        while (true) {
            printInput("giới tính: 0-Nữ,1-Name,2-Khác");
            sex = sc.nextByte();
            if(sex >=0 && sex <= 2){
                break;
            }
            printError("giới tính: 0-Nữ,1-Name,2-Khác");
        }
        return sex;
    }

    public String checkName(){
        String name="";
        while (true){
            printInput(" tên (ví dụ: Nguyen)");
            name= sc.nextLine();
            if(name.matches("^[A-Z]\\w+")){
                break;
            }
            printError("tên");
        }
        return name;
    }

    public String checkAddress(){
        String rs="";
        while (true){
            printInput(" địa chỉ (ví dụ: Nghe An)");
            rs= sc.nextLine();
            if(rs.matches("^[A-Z]\\w+ (([A-Z]\\w+)||(([A-Z]\\w+ [A-Z]\\w+)))")){
                break;
            }
            printError("địa chỉ (ví dụ: Nghe An)");
        }
        return rs;
    }

    public String checkPassword(){
        String password = "";
        while (true) {
            printInput("mật khẩu");
            password = new Scanner(System.in).nextLine();
            if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$")) {
                break;
            }
            printError("mật khẩu");
        }
        return password;
    }

    public String checkPhoneNumber(){
        String phoneNumber="";
        while (true){
            printInput("số điện thoại");
            phoneNumber= sc.nextLine();
            if(phoneNumber.matches("^([09]|[03]|[08])\\d{8}")){
                break;
            }
            printError("số điện thoại");
        }
        return phoneNumber;
    }

    public boolean isEmail(String password) {
        return password.matches("\\w+");
    }

    public boolean isPassword(String password) {
        return password.matches("\\w+");
    }

    public void printInput(String text) {
        System.out.println("Mời bạn nhâp "+ text+" : ");
    }

    public void printError(String text) {
        System.out.println("Nhập lỗi định dạng của "+ text + ". Vui lòng nhập lại");
    }

}
