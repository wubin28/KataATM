package com.wubinben.kata.kataatm.application;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 下午9:16
 * To change this template use File | Settings | File Templates.
 */
public class DepositCommand extends Command {
    @Override
    public void execute(Account account, int amount) {
        account.deposit(amount);
    }

    public static DepositCommand newInstance() {
        return new DepositCommand();
    }
}
