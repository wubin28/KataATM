package com.wubinben.kata.kataatm;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 下午6:26
 * To change this template use File | Settings | File Templates.
 */
public class ElectricityCard {
    private int addedUnits;

    public ElectricityCard(int addedUnits) {
        this.addedUnits = addedUnits;
    }

    public static ElectricityCard newInstance(int amount) {
        return new ElectricityCard(amount);
    }

    public int getAddedUnits() {
        return this.addedUnits;
    }

    public void recharge(int addedUnits) {
        this.addedUnits = addedUnits;
    }
}
