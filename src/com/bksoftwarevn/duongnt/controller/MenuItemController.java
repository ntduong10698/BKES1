package com.bksoftwarevn.duongnt.controller;

import com.bksoftwarevn.duongnt.common.AppConst;
import com.bksoftwarevn.duongnt.model.MenuItem;
import java.util.Scanner;

public class MenuItemController {

    PersonController personController = new PersonController();

    public void showMenuHome() {
        System.out.println(AppConst.nameProject);
        MenuItem dangNhap = new MenuItem(1, "Đăng Nhập");
        MenuItem dangKy = new MenuItem(2, "Đăng Ký");
        MenuItem timKiem = new MenuItem(3, "Tìm Kiếm");
        MenuItem thoat = new MenuItem(0, "Thoát");
        showMenu(dangNhap, dangKy, timKiem, thoat, dangKy, dangKy, dangKy);
        while(true){
            System.out.println("Mời bạn nhập lựa chọn theo đúng số thứ tự trên menu.");
            int chon = new Scanner(System.in).nextInt();
            if(!actionMenuHome(chon)) {
                break;
            } else {
                showMenuHome();
            }
        }
    }

    public boolean actionMenuHome(int option) {
        boolean rs = true;
        switch (option) {
            case 1:
                personController.signIn();
                break;
            case 2:
                personController.signUp();
                break;
            case 3:
                personController.searchName();
                break;
            case 0:
                rs = false;
                System.exit(0);
                break;
            default:
                System.out.println("Chọn sai vui lòng chọn lại!");
                break;
        }
        return rs;
    }

    public void showMenu(MenuItem ...listMenu) {
        int len = listMenu.length;
        for (int i = 0; i < len; i++) {
            System.out.println(listMenu[i]);
        }
    }
}
