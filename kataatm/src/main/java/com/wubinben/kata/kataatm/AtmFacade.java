package com.wubinben.kata.kataatm;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 上午9:58
 * To change this template use File | Settings | File Templates.
 */
public class AtmFacade {
    private int balance;
    private int addedUnits;

    public static AtmFacade newInstance() {
        return new AtmFacade();
    }

    public void doSelfService(String action, int amount) {
        if (action.equals("deposit in RMB Yuan")) {
            this.balance += amount;
        } else if (action.equals("withdraw in RMB Yuan")) {
            this.balance -= amount;
        } else if (action.equals("recharge electricity in unit")) {
            this.addedUnits = amount;
            this.balance -= amount * 2;
        }
    }

    public void setOldBalance(int oldBalance) {
        this.balance = oldBalance;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getAddedUnits() {
        return this.addedUnits;
    }
}
