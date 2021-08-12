package com.oop.接口例子;

public class Customer {
    private Menu _menu;
    Customer(){

    }
    Customer(Menu menu){
        this._menu = menu;
    }

    public Menu get_menu() {
        return _menu;
    }

    public void set_menu(Menu _menu) {
        this._menu = _menu;
    }

    public void order(){
        _menu.cookFriedChicken();
        _menu.cookHamburg();
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Menu menu = new MacDonaldMenu();
        customer.set_menu(menu);
        customer.order();
    }
}
