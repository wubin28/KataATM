package com.wubinben.kata.kataatm.toolkit;

import com.wubinben.kata.kataatm.application.Account;
import com.wubinben.kata.kataatm.application.Command;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 下午2:13
 * To change this template use File | Settings | File Templates.
 */
public class MenuItem {
    private final String menuItemName;
    private Command command;

    public MenuItem(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public static MenuItem newInstance(String menuItemName) {
        return new MenuItem(menuItemName);
    }

    public void deposit(Account account, int amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, int amount) {
        account.withdraw(amount);
    }

    public void recharge(Account account, int amount) {
        account.withdraw(amount * 2);
    }

    public void clicked(Account account, int amount) {
        this.command.execute(account, amount);
    }
}
