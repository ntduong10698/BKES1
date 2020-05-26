package com.bksoftwarevn.duongnt.controller;

import com.bksoftwarevn.duongnt.model.Person;

import java.util.Scanner;

public class PersonController {

    Scanner sc = new Scanner(System.in);

    public Person createPerson() {
        Person p = null;
        return p;
    }

    public String checkName() {
        String name = "";
        while (true) {
            System.out.println("Mời bạn nhập tên: ");
            name = sc.nextLine();
            if(name.matches("\\w+")) {
                break;
            }
            System.out.println("Nhập lỗi định dạng của tên. Vui lòng nhập lại");
        }
        return name;
    }

    //. Mật khẩu tối thiểu 1 ký tự, 1 chữ cái và 1 ký tự đặc biệt và lớn hơn hoặc bằng 8 ký tự
    public String checkPassword() {
        String name = "";
        while (true) {
            printInput("mật khẩu. Mật khẩu như nào");
            name = sc.nextLine();
            if(isPassword(name)) {
                break;
            }
            printError("mật khẩu. Mật khẩu như nào");
        }
        return name;
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
