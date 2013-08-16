package com.wubinben.kata.kataatm;


/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 上午9:58
 * To change this template use File | Settings | File Templates.
 */
public class AtmFacade {
    private final MenuItem depositMenuItem;
    private final MenuItem withdrawMenuItem;
    private final MenuItem electricityCardMenuItem;
    private int balance;
    private int addedUnits;
    private Account account;
    private ElectricityCard electricityCard;

    public AtmFacade() {
        this.depositMenuItem = MenuItem.newInstance("deposit");
        this.withdrawMenuItem = MenuItem.newInstance("withdraw");
        this.electricityCardMenuItem = MenuItem.newInstance("electricityCard");
        this.account = Account.newInstance(0);
        this.electricityCard = ElectricityCard.newInstance(0);
    }

    public static AtmFacade newInstance() {
        return new AtmFacade();
    }

    public void doSelfService(String action, int amount) {
        if (action.equals("deposit in RMB Yuan")) {
            this.depositMenuItem.deposit(this.account, amount);
            this.balance += amount;
        } else if (action.equals("withdraw in RMB Yuan")) {
            this.withdrawMenuItem.withdraw(this.account, amount);
            this.balance -= amount;
        } else if (action.equals("recharge electricity in unit")) {
            this.electricityCard.recharge(amount);
            this.electricityCardMenuItem.recharge(this.account, amount);
            this.addedUnits = amount;
            this.balance -= amount * 2;
        }
    }

    public void setOldBalance(int oldBalance) {
        this.account.setBalance(oldBalance);
        this.balance = oldBalance;
    }

    public int getBalance() {
        return this.account.getBalance();
    }

    public int getAddedUnits() {
        return this.electricityCard.getAddedUnits();
    }
}
