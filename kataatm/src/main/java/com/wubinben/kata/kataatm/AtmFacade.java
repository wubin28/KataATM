package com.wubinben.kata.kataatm;


import com.wubinben.kata.kataatm.application.*;
import com.wubinben.kata.kataatm.toolkit.MenuItem;

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
    private Account account;
    private ElectricityCard electricityCard;

    public AtmFacade() {
        this.account = Account.newInstance(0);
        this.electricityCard = ElectricityCard.newInstance(0);

        this.depositMenuItem = MenuItem.newInstance("deposit");
        this.depositMenuItem.setCommand(DepositCommand.newInstance());

        this.withdrawMenuItem = MenuItem.newInstance("withdraw");
        this.withdrawMenuItem.setCommand(WithdrawCommand.newInstance());

        this.electricityCardMenuItem = MenuItem.newInstance("electricityCard");
        this.electricityCardMenuItem.setCommand(ElectricityCardCommand.newInstance());

    }

    public static AtmFacade newInstance() {
        return new AtmFacade();
    }

    public void doSelfService(String action, int amount) {
        if (action.equals("deposit in RMB Yuan")) {
            this.depositMenuItem.clicked(this.account, amount);
        } else if (action.equals("withdraw in RMB Yuan")) {
            this.withdrawMenuItem.clicked(this.account, amount);
        } else if (action.equals("recharge electricity in unit")) {
            this.electricityCard.recharge(amount);
            this.electricityCardMenuItem.clicked(this.account, amount);
        }
    }

    public void setOldBalance(int oldBalance) {
        this.account.setBalance(oldBalance);
    }

    public int getBalance() {
        return this.account.getBalance();
    }

    public int getAddedUnits() {
        return this.electricityCard.getAddedUnits();
    }
}
