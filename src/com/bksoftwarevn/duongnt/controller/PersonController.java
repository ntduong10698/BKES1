package com.bksoftwarevn.duongnt.controller;

import com.bksoftwarevn.duongnt.common.AppConst;
import com.bksoftwarevn.duongnt.model.Person;

import java.util.ArrayList;
import java.util.Scanner;


//đăng nhập, đăng ký với trường status, tìm kiếm các thuộc tính
public class PersonController {
    
    //signIn
    public Person signIn() {
        System.out.println("*****Đăng nhập*****");
        Person p = null;
        printInput("email");
        String email = new Scanner(System.in).nextLine();
        printInput("password");
        String password = new Scanner(System.in).nextLine();
        if(isEmail(email) && isPassword(password)) {
            for(Person p1: AppConst.listPerson) {
                if(p1.getStatus() == 0 && p1.getEmail().equals(email) &&
                        p1.getPassword().equals(password)) {
                    p = p1;
                    break;
                }
            }
        }
        if(p == null) {
            System.out.println("Tài khoản hoặc mật khẩu không đúng!");
        } else {
            System.out.println("*****Đăng nhập thành công.*****");
            System.out.println(AppConst.nameProject);
        }
        return p;
    }

    //signUp
    public Person signUp() {
        System.out.println("*****Đăng ký*****");
        Person p = null;
        //khởi tạo một person
        p = new Person(AppConst.count++, checkName(), checkSex(),
                checkEmail(), checkPassword(), checkPhoneNumber(),
                checkAddress(), (byte) 0, false);
        //lưu trữ person vừa khởi tạo thành công.
        AppConst.listPerson.add(p);
        System.out.println("*****Đăng ký thành công. Vui lòng đăng nhập để sử dụng hệ thống*****");
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
            if (isEmail(email)) {
                if(checkInitEmail(email)) {
                    System.out.println("Email đã trùng. Vui lòng nhập lại!");
                } else {
                    break;
                }
            } else {
                printError("email");
            }
        }
        return email;
    }

    public boolean checkInitEmail(String email) {
        boolean rs = false;
        for (Person p: AppConst.listPerson) {
            if(p.getStatus() < 2 && p.getEmail().equals(email)) {
                rs = true;
                break;
            }
        }
        return rs;
    }

    public byte checkSex(){
        byte sex = 0;
        while (true) {
            printInput("giới tính: 0-Nữ,1-Name,2-Khác");
            sex = new Scanner(System.in).nextByte();
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
            name= new Scanner(System.in).nextLine();
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
            rs= new Scanner(System.in).nextLine();
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
            if (isPassword(password)) {
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
            phoneNumber= new Scanner(System.in).nextLine();
            if(phoneNumber.matches("(09|03|08)\\d{8}")){
                break;
            }
            printError("số điện thoại");
        }
        return phoneNumber;
    }

    public boolean isEmail(String email) {
//        return email.matches(" ^[a-zA-Z][a-zA-Z0-9_\\.]{5,32}@ [a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,3}$" );
            return true;
    }

    public boolean isPassword(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");
    }

    public void printInput(String text) {
        System.out.println("Mời bạn nhâp "+ text+" : ");
    }

    public void printError(String text) {
        System.out.println("Nhập lỗi định dạng của "+ text + ". Vui lòng nhập lại");
    }

    //***********từ đây viết các hàm tìm kiếm trừ id, password, status, admin
    public void searchAddress(boolean admin) {
        System.out.println("*****Tìm kiếm địa chỉ*****");
        printInput("Địa chỉ");
        String address = new Scanner(System.in).nextLine();
        int count = 0;
        if(admin) {
            for(Person p: AppConst.listPerson) {
                if(p.getStatus() < 2 && p.getAddress().toUpperCase().indexOf(address.toUpperCase()) > 0) {
                    System.out.println(p);
                    count++;
                }
            }
        } else {
            for(Person p: AppConst.listPerson) {
                if(p.getStatus() == 0 && p.getAddress().toUpperCase().indexOf(address.toUpperCase()) > 0) {
                    System.out.println(p);
                    count++;
                }
            }
        }

        if(count == 0) {
            System.out.println("Không có thông tin tìm kiếm phù hợp!");
        } else {
            System.out.println("Có "+count+" thông tin tìm kiếm phù hợp");
        }
    }

    public void searchName() {}

    public void searchSex() {}

}
