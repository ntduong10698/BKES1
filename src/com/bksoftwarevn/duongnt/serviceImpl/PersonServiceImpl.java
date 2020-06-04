package com.bksoftwarevn.duongnt.serviceImpl;

import com.bksoftwarevn.duongnt.common.AppConst;
import com.bksoftwarevn.duongnt.model.Person;
import com.bksoftwarevn.duongnt.service.PersonService;

import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    @Override
    public Person signUp() {
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

    public void printInput(String text) {
        System.out.println("Mời bạn nhâp "+ text+" : ");
    }

    public void printError(String text) {
        System.out.println("Nhập lỗi định dạng của "+ text + ". Vui lòng nhập lại");
    }

    @Override
    public Person signIn() {
        return null;
    }

    @Override
    public void search() {

    }

    public boolean isEmail(String email) {
//        return email.matches(" ^[a-zA-Z][a-zA-Z0-9_\\.]{5,32}@ [a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,3}$" );
        return true;
    }

    public boolean isPassword(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");
    }
}
