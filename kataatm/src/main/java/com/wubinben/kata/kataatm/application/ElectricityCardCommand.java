package com.wubinben.kata.kataatm.application;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 下午9:40
 * To change this template use File | Settings | File Templates.
 */
public class ElectricityCardCommand extends Command {
    public ElectricityCardCommand(Account account) {
        super(account);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void execute(int amount) {
        super.account.withdraw(amount * 2);
    }

    public static ElectricityCardCommand newInstance(Account account) {
        return new ElectricityCardCommand(account);
    }
}
