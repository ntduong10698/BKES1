package com.bksoftwarevn.duongnt.view;

import com.bksoftwarevn.duongnt.common.AppConst;
import com.bksoftwarevn.duongnt.controller.MenuItemController;
import com.bksoftwarevn.duongnt.controller.PersonController;
import com.bksoftwarevn.duongnt.model.MenuItem;
import com.bksoftwarevn.duongnt.model.Person;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuItemController menuItemController = new MenuItemController();
        menuItemController.showMenuHome();
    }
}
