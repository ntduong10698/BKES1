package com.bksoftwarevn.duongnt.controller;

import com.bksoftwarevn.duongnt.common.AppConst;
import com.bksoftwarevn.duongnt.model.MenuItem;
import com.bksoftwarevn.duongnt.model.Person;

import java.util.Scanner;

public class MenuItemController {

    //hoàn thiện project với đầy đủ các chức năng như mô tả.

    PersonController personController = new PersonController();

    public void showMenuHome() {
        System.out.println(AppConst.nameProject);
        MenuItem dangNhap = new MenuItem(1, "Đăng Nhập");
        MenuItem dangKy = new MenuItem(2, "Đăng Ký");
        MenuItem thoat = new MenuItem(0, "Thoát");
        showMenu(dangNhap, dangKy, thoat);
        while(true){
            System.out.println("Mời bạn nhập lựa chọn theo đúng số thứ tự trên menu.");
            int chon = new Scanner(System.in).nextInt();
            actionMenuHome(chon);
            showMenuHome();
        }
    }

    public void actionMenuHome(int option) {
        switch (option) {
            case 1:
                Person p1 = personController.signIn();
                if(p1 != null) showMenuDangNhap(p1);
                break;
            case 2:
                personController.signUp();
                break;
            case 3:
                personController.searchName();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Chọn sai vui lòng chọn lại!");
                break;
        }
    }

    public void showMenuDangNhap(Person p) {
        System.out.println("Chào mừng " + p.getName() + " đến với hệ thống BKES");
        MenuItem timKiem = new MenuItem(1, "Tìm kiếm");
        MenuItem khoaTK = new MenuItem(2, "Khóa tài khoản");
        MenuItem xoaTK = new MenuItem(2, "Xóa tài khoản");
        MenuItem thoat = new MenuItem(0, "Thoát");
        if(p.isAdmin()) {
            showMenu(timKiem, xoaTK, thoat);
        } else {
            showMenu(timKiem, khoaTK, thoat);
        }
        int chon = new Scanner(System.in).nextInt();
        while(true) {
            actionMenuDangNhap(p, chon);
            showMenuDangNhap(p);
        }
    }

    public void actionMenuDangNhap(Person p, int option) {
        if(p.isAdmin()) {
            switch (option) {
                case 1:

                    break;
                case 2:
                    // gọi đến xóa tài khoản
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng chưa hỗ trợ. Vui lòng thử lại sau!");
            }
        } else {
            switch (option) {
                case 1:
                    break;
                case 2:
                    // gọi đến khóa tài khoản
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng chưa hỗ trợ. Vui lòng thử lại sau!");
            }
        }
    }

    public void showMenu(MenuItem ...listMenu) {
        int len = listMenu.length;
        for (int i = 0; i < len; i++) {
            System.out.println(listMenu[i]);
        }
    }
}
